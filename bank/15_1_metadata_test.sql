SELECT tb1.table_name,
    (SELECT count(*) FROM information_schema.columns clm
     WHERE clm.table_schema = tb1.table_schema
        AND clm.table_name = tb1.table_name) num_columns,
    (SELECT count(*) FROM information_schema.statistics sta
     WHERE sta.table_schema = tb1.table_schema
        AND sta.table_name = tb1.table_name) num_indexes,
    (SELECT count(*) FROM information_schema.table_constraints tc
     WHERE tc.table_schema = tb1.table_schema
        AND tc.table_name = tb1.table_name
        AND tc.constraint_type = 'PRIMARY KEY') num_primary_keys
FROM information_schema.tables tb1
WHERE tb1.table_schema = 'bank' AND tb1.table_type = 'BASE TABLE'
ORDER BY 1;
