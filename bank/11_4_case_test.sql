SELECT c.cust_id, c.fed_id, c.cust_type_cd,
    CASE
        WHEN EXISTS (SELECT 1 FROM account a
            WHERE a.cust_id = c.cust_id
                AND a.product_cd = 'CHK') THEN 'Y'
            ELSE 'N'
        END has_checking,
    CASE
        WHEN EXISTS (SELECT 1 FROM account a
            WHERE a.cust_id = c.cust_id
                AND a.product_cd = 'SAV') THEN 'Y'
            ELSE 'N'
        END has_savings
FROM customer c;
