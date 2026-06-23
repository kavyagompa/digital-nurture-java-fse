-- Add bonus percentage to employee salary in a department

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_dept_id IN NUMBER,
  p_bonus_percent IN NUMBER
) AS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * p_bonus_percent / 100)
  WHERE department_id = p_dept_id;

  COMMIT;

  DBMS_OUTPUT.PUT_LINE('Bonus updated successfully for department: ' || p_dept_id);
END;
/