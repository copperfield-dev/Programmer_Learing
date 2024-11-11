SELECT c.cust_id, c.fed_id, c.cust_type_cd,
    CASE (SELECT COUNT(*) FROM account a
            WHERE a.cust_id = c.cust_id)
        WHEN 0 THEN 'None'
        WHEN 1 THEN '1'
        WHEN 2 THEN '2'
        ELSE '3+'
    END num_accounts
FROM customer c;
