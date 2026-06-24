-- Scenario 2: Set VIP status for customers with balance > 10000

BEGIN
  FOR c IN (SELECT customer_id, balance FROM customers) LOOP

    IF c.balance > 10000 THEN
      UPDATE customers
      SET is_vip = 'TRUE'
      WHERE customer_id = c.customer_id;
    END IF;

  END LOOP;

  COMMIT;
END;
/