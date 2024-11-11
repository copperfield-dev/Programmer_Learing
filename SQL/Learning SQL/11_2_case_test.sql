SELECT c.cust_id, c.fed_id,
    CASE
        WHEN c.cust_type_cd = 'I' THEN
            (SELECT CONCAT(i.fname, ' ', i.lname)
             FROM individual i
             WHERE i.cust_id = c.cust_id)
        WHEN c.cust_type_cd = 'B' THEN
            (SELECT b.name
             FROM business b
	     WHERE b.cust_id = c.cust_id)
        ELSE 'Unknown'
    END name
FROM customer c;