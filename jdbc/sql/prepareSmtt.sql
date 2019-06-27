
SQL*Plus: Release 10.2.0.1.0 - Production on Thu Jun 27 07:29:25 2019

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Enter user-name: system
Enter password:

Connected to:
Oracle Database 10g Express Edition Release 10.2.0.1.0 - Production

SQL>
SQL>
SQL>
SQL> select * from batch;

        ID NAME                  STU_COUNT BATCH_TYPE
---------- -------------------- ---------- --------------------
         1 batch_1                      10 regular
         2 batch_2                      20 regular
         6 batch_6                      30 wek
         5 batch_5                      34 wek

SQL> select * from bacth where stu_count between 10 and 20;
select * from bacth where stu_count between 10 and 20
              *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL> select * from batch where stu_count between 10 and 20;

        ID NAME                  STU_COUNT BATCH_TYPE
---------- -------------------- ---------- --------------------
         1 batch_1                      10 regular
         2 batch_2                      20 regular

SQL>
SQL>
SQL> create sequence batch_seq start with 1 increment by 1;

Sequence created.

SQL> select batch_seq.nextval from dual;

   NEXTVAL
----------
         1

SQL> select batch_seq.nextval from dual;

   NEXTVAL
----------
         2

SQL> select batch_seq.nextval from dual;

   NEXTVAL
----------
         3

SQL> select batch_seq.nextval from dual;

   NEXTVAL
----------
         4

SQL> select batch_seq.nextval from dual;

   NEXTVAL
----------
         5

SQL> select batch_seq.nextval from dual;

   NEXTVAL
----------
         6

SQL> select * from batch;

        ID NAME                  STU_COUNT BATCH_TYPE
---------- -------------------- ---------- --------------------
         1 batch_1                      10 regular
         2 batch_2                      20 regular
         6 batch_6                      30 wek
         7 batch_10                     23 wek
         5 batch_5                      34 wek
         8 batch_11                     25 reg
         9 batch_12                     30 reg
        10 batch_13                     45 wek

8 rows selected.

SQL>
SQL>
SQL> alter table batch add batch_pic blob;

Table altered.

SQL> desc batch;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(10)
 NAME                                               VARCHAR2(20)
 STU_COUNT                                          NUMBER(10)
 BATCH_TYPE                                         VARCHAR2(20)
 BATCH_PIC                                          BLOB

SQL> select * from batch;
SP2-0678: Column or attribute type can not be displayed by SQL*Plus
SQL>