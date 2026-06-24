-- Scenario 1: Apply 1% discount for customers above 60 years old

BEGIN
  FOR c IN (SELECT customer_id, age FROM customers) LOOP

    IF c.age > 60 THEN
      UPDATE loans
      SET interest_rate = interest_rate - 1
      WHERE customer_id = c.customer_id;
    END IF;

  END LOOP;

  COMMIT;
END;
/