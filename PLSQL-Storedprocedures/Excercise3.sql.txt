SET SERVEROUTPUT ON;

-- Scenario 1
DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, DOB FROM Customers;
    v_age NUMBER;
BEGIN
    FOR rec IN c_customers LOOP
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB)/12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 2
DECLARE
BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 3
BEGIN
    FOR rec IN (
        SELECT c.Name, l.EndDate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: ' || rec.Name || ' loan due on ' || rec.EndDate
        );
    END LOOP;
END;
/