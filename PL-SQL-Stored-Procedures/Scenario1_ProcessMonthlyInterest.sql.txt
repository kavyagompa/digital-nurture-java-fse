-- Apply 1% interest to all savings accounts

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE accounts
  SET balance = balance + (balance * 0.01)
  WHERE account_type = 'SAVINGS';

  COMMIT;

  DBMS_OUTPUT.PUT_LINE('Monthly interest applied successfully.');
END;
/