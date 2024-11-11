SELECT
    SUM(CASE
            WHEN EXTRACT(YEAR FROM open_date) = 2000 THEN 1
            ELSE 0
        END) year_2000,
    SUM(CASE
            WHEN EXTRACT(YEAR FROM open_date) = 2001 THEN 1
            ELSE 0
        END) year_2001,
    SUM(CASE
            WHEN EXTRACT(YEAR FROM open_date) = 2002 THEN 1
            ELSE 0
        END) year_2002,
    SUM(CASE
            WHEN EXTRACT(YEAR FROM open_date) = 2003 THEN 1
            ELSE 0
        END) year_2003,
    SUM(CASE
            WHEN EXTRACT(YEAR FROM open_date) = 2004 THEN 1
            ELSE 0
        END) year_2004,
    SUM(CASE
            WHEN EXTRACT(YEAR FROM open_date) = 2005 THEN 1
            ELSE 0
        END) year_2005
FROM account
WHERE open_date > '1999-12-31' AND open_date < '2006-01-01';
