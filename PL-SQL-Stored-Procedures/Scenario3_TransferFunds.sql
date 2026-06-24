-- Transfer money between accounts with balance check

CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  -- Check balance
  SELECT balance INTO v_balance
  FROM accounts
  WHERE account_id = p_from_account;

  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient balance. Transfer failed.');
  ELSE
    -- Debit from source
    UPDATE accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_account;

    -- Credit to target
    UPDATE accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_account;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
  END IF;

EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Account not found.');
END;
/