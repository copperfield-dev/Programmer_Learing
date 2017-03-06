CREATE VIEW business_customer_vw
    (cust_id,
     fed_id,
     cust_type_cd,
     address,
     city,
     state,
     zipcode
    )
AS
SELECT cust_id,
    concat('ends in ', substr(fed_id, 8, 4)) fed_id,
    cust_type_cd,
    address,
    city,
    state,
    postal_code
FROM customer
WHERE cust_type_cd = 'B';
