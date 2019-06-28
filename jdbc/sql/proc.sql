
SQL*Plus: Release 10.2.0.1.0 - Production on Fri Jun 28 07:31:30 2019

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Enter user-name: system/system

Connected to:
Oracle Database 10g Express Edition Release 10.2.0.1.0 - Production

SQL> select sysdate from dual;

SYSDATE
---------
28-JUN-19

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
SYSCATALOG                     SYNONYM
CATALOG                        SYNONYM
TAB                            SYNONYM
COL                            SYNONYM
TABQUOTAS                      SYNONYM
SYSFILES                       SYNONYM
PUBLICSYN                      SYNONYM
MVIEW$_ADV_WORKLOAD            TABLE
MVIEW$_ADV_BASETABLE           TABLE
MVIEW$_ADV_SQLDEPEND           TABLE
MVIEW$_ADV_PRETTY              TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
MVIEW$_ADV_TEMP                TABLE
MVIEW$_ADV_FILTER              TABLE
MVIEW$_ADV_LOG                 TABLE
MVIEW$_ADV_FILTERINSTANCE      TABLE
MVIEW$_ADV_LEVEL               TABLE
MVIEW$_ADV_ROLLUP              TABLE
MVIEW$_ADV_AJG                 TABLE
MVIEW$_ADV_FJG                 TABLE
MVIEW$_ADV_GC                  TABLE
MVIEW$_ADV_CLIQUE              TABLE
MVIEW$_ADV_ELIGIBLE            TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
MVIEW$_ADV_OUTPUT              TABLE
MVIEW$_ADV_EXCEPTIONS          TABLE
MVIEW$_ADV_PARAMETERS          TABLE
MVIEW$_ADV_INFO                TABLE
MVIEW$_ADV_JOURNAL             TABLE
MVIEW$_ADV_PLAN                TABLE
MVIEW_WORKLOAD                 VIEW
MVIEW_FILTER                   VIEW
MVIEW_LOG                      VIEW
MVIEW_FILTERINSTANCE           VIEW
MVIEW_RECOMMENDATIONS          VIEW

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
MVIEW_EVALUATIONS              VIEW
MVIEW_EXCEPTIONS               VIEW
AQ$_QUEUE_TABLES               TABLE
AQ$_QUEUES                     TABLE
AQ$_SCHEDULES                  TABLE
AQ$_INTERNET_AGENTS            TABLE
AQ$_INTERNET_AGENT_PRIVS       TABLE
DEF$_AQCALL                    TABLE
DEF$_AQERROR                   TABLE
AQ$_DEF$_AQCALL_F              VIEW
AQ$DEF$_AQCALL                 VIEW

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
DEF$_ERROR                     TABLE
AQ$_DEF$_AQERROR_F             VIEW
AQ$DEF$_AQERROR                VIEW
DEF$_DESTINATION               TABLE
DEF$_CALLDEST                  TABLE
DEF$_DEFAULTDEST               TABLE
DEF$_LOB                       TABLE
DEF$_TEMP$LOB                  TABLE
DEF$_PROPAGATOR                TABLE
DEF$_ORIGIN                    TABLE
DEF$_PUSHED_TRANSACTIONS       TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
OL$                            TABLE
OL$HINTS                       TABLE
OL$NODES                       TABLE
LOGMNR_SESSION_EVOLVE$         TABLE
LOGMNR_HEADER1$                TABLE
LOGMNR_HEADER2$                TABLE
LOGMNR_UID$                    TABLE
LOGMNRC_DBNAME_UID_MAP         TABLE
LOGMNR_DICTSTATE$              TABLE
LOGMNR_DICTIONARY$             TABLE
LOGMNR_OBJ$                    TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
LOGMNR_USER$                   TABLE
LOGMNRC_GTLO                   TABLE
LOGMNRC_GTCS                   TABLE
LOGMNRC_GSII                   TABLE
LOGMNR_TAB$                    TABLE
LOGMNR_COL$                    TABLE
LOGMNR_ATTRCOL$                TABLE
LOGMNR_TS$                     TABLE
LOGMNR_IND$                    TABLE
LOGMNR_TABPART$                TABLE
LOGMNR_TABSUBPART$             TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
LOGMNR_TABCOMPART$             TABLE
LOGMNR_TYPE$                   TABLE
LOGMNR_COLTYPE$                TABLE
LOGMNR_ATTRIBUTE$              TABLE
LOGMNR_LOB$                    TABLE
LOGMNR_CDEF$                   TABLE
LOGMNR_CCOL$                   TABLE
LOGMNR_ICOL$                   TABLE
LOGMNR_LOBFRAG$                TABLE
LOGMNR_INDPART$                TABLE
LOGMNR_INDSUBPART$             TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
LOGMNR_INDCOMPART$             TABLE
LOGMNRP_CTAS_PART_MAP          TABLE
LOGMNRT_MDDL$                  TABLE
LOGMNR_LOG$                    TABLE
LOGMNR_PROCESSED_LOG$          TABLE
LOGMNR_SPILL$                  TABLE
LOGMNR_AGE_SPILL$              TABLE
LOGMNR_RESTART_CKPT_TXINFO$    TABLE
LOGMNR_ERROR$                  TABLE
LOGMNR_RESTART_CKPT$           TABLE
LOGMNR_FILTER$                 TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
LOGMNR_PARAMETER$              TABLE
LOGMNR_SESSION$                TABLE
LOGSTDBY$PARAMETERS            TABLE
LOGSTDBY$EVENTS                TABLE
LOGSTDBY$APPLY_PROGRESS        TABLE
LOGSTDBY$APPLY_MILESTONE       TABLE
LOGSTDBY$SCN                   TABLE
LOGSTDBY$PLSQL                 TABLE
LOGSTDBY$SKIP_TRANSACTION      TABLE
LOGSTDBY$SKIP                  TABLE
LOGSTDBY$SKIP_SUPPORT          TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
LOGSTDBY$HISTORY               TABLE
REPCAT$_REPCAT                 TABLE
REPCAT$_FLAVORS                TABLE
REPCAT$_REPSCHEMA              TABLE
REPCAT$_SNAPGROUP              TABLE
REPCAT$_REPOBJECT              TABLE
REPCAT$_REPCOLUMN              TABLE
REPCAT$_KEY_COLUMNS            TABLE
REPCAT$_GENERATED              TABLE
REPCAT$_REPPROP                TABLE
REPCAT$_REPCATLOG              TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
REPCAT$_DDL                    TABLE
REPCAT$_REPGROUP_PRIVS         TABLE
REPCAT$_PRIORITY_GROUP         TABLE
REPCAT$_PRIORITY               TABLE
REPCAT$_COLUMN_GROUP           TABLE
REPCAT$_GROUPED_COLUMN         TABLE
REPCAT$_CONFLICT               TABLE
REPCAT$_RESOLUTION_METHOD      TABLE
REPCAT$_RESOLUTION             TABLE
REPCAT$_RESOLUTION_STATISTICS  TABLE
REPCAT$_RESOL_STATS_CONTROL    TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
REPCAT$_PARAMETER_COLUMN       TABLE
REPCAT$_AUDIT_ATTRIBUTE        TABLE
REPCAT$_AUDIT_COLUMN           TABLE
REPCAT$_FLAVOR_OBJECTS         TABLE
REPCAT$_TEMPLATE_STATUS        TABLE
REPCAT$_TEMPLATE_TYPES         TABLE
REPCAT$_REFRESH_TEMPLATES      TABLE
REPCAT$_USER_AUTHORIZATIONS    TABLE
REPCAT$_OBJECT_TYPES           TABLE
REPCAT$_TEMPLATE_REFGROUPS     TABLE
REPCAT$_TEMPLATE_OBJECTS       TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
REPCAT$_TEMPLATE_PARMS         TABLE
REPCAT$_OBJECT_PARMS           TABLE
REPCAT$_USER_PARM_VALUES       TABLE
REPCAT$_TEMPLATE_SITES         TABLE
REPCAT$_SITE_OBJECTS           TABLE
REPCAT$_RUNTIME_PARMS          TABLE
REPCAT$_TEMPLATE_TARGETS       TABLE
REPCAT$_EXCEPTIONS             TABLE
REPCAT$_INSTANTIATION_DDL      TABLE
REPCAT$_EXTENSION              TABLE
REPCAT$_SITES_NEW              TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
STU                            TABLE
PRODUCT                        TABLE
PARENTS                        TABLE
CHAILD                         TABLE
CHILD_TAB                      TABLE
PARENT_TAB                     TABLE
SQLPLUS_PRODUCT_PROFILE        TABLE
PRODUCT_PRIVS                  VIEW
PRODUCT_USER_PROFILE           SYNONYM
HELP                           TABLE
PER_TAB                        TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
PRODUCT_DETAILS                TABLE
USER_DTLS                      TABLE
PRODUCT_COMMENTS               TABLE
PRODUCT_RATINGS                TABLE
CUSTOMER                       TABLE
VENDOR                         TABLE
COURSE                         TABLE
STUDENT                        TABLE
STUDENT_COURSE                 TABLE
EMP                            TABLE
REG_TAB                        TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
REG_TABLE                      TABLE
USERLIST                       TABLE
TEAMS                          TABLE
BOOKS                          TABLE
PLAYERS                        TABLE
COACH                          TABLE
COUNTRY                        TABLE
USER_DATA                      TABLE
USERS                          TABLE
BATCH                          TABLE
FLIGHTS                        TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
ACTOR_TAB                      TABLE
REG_DATA                       TABLE
STUDENT_TAB                    TABLE
MOVIE_TAB                      TABLE
COURSE_TAB                     TABLE
STU_COURSES_TAB                TABLE
STU_COURSE_TAB                 TABLE
STU_TAB                        TABLE
TEAM_PLAYERS                   TABLE
STUDENT_TABLE                  TABLE
EMP_TAB                        TABLE

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
PRODUCT_TABLE                  TABLE
STU_DET                        TABLE

200 rows selected.

SQL> select * from emp_tab;

       EID ENAME                                 SAL
---------- ------------------------------ ----------
         1 abhi                               500000
         2 abhi                               500000
         3 abhi                               500000
         4 abhi                               500000

SQL> select * from emp;
SP2-0678: Column or attribute type can not be displayed by SQL*Plus
SQL> desc emp;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                                 NUMBER(10)
 NAME                                               VARCHAR2(20)
 EMP_PIC                                            BLOB

SQL>
SQL>
SQL>
SQL>
SQL>
SQL>
SQL> create table emp_data(emp_id number(10) primary key,emp_name varchar2(20),sal number(8,4),hiredate date);

Table created.

SQL> desc emp_data;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMP_ID                                    NOT NULL NUMBER(10)
 EMP_NAME                                           VARCHAR2(20)
 SAL                                                NUMBER(8,4)
 HIREDATE                                           DATE

SQL> insert into emp_data values(1,'John',30000,'22-AUG-99');
insert into emp_data values(1,'John',30000,'22-AUG-99')
                                     *
ERROR at line 1:
ORA-01438: value larger than specified precision allowed for this column


SQL> insert into emp_data values(1,'John',30000,'22-AUG-99');
insert into emp_data values(1,'John',30000,'22-AUG-99')
                                     *
ERROR at line 1:
ORA-01438: value larger than specified precision allowed for this column


SQL>
SQL>
SQL> alter table emp_data modify sal number(10,4);

Table altered.

SQL> insert into emp_data values(1,'John',30000,'22-AUG-99');

1 row created.

SQL> insert into emp_data values(2,'clerk',50000,'22-AUG-10');

1 row created.

SQL> insert into emp_data values(3,'mike',70000,'10-JAN-15');

1 row created.

SQL> commit;

Commit complete.

SQL> select * from emp_data;

    EMP_ID EMP_NAME                    SAL HIREDATE
---------- -------------------- ---------- ---------
         1 John                      30000 22-AUG-99
         2 clerk                     50000 22-AUG-10
         3 mike                      70000 10-JAN-15

SQL> create procedure emp_exp(empid in number,exp out number,empname out varchar)
  2  is
  3  todaysDate date;
  4  doj date;
  5  select hiredate,emp_name into doj,todaysDate from emp where emp_id=empid;
  6  exp:=(todaysDate-doj)/365;
  7  /

Warning: Procedure created with compilation errors.

SQL> show errors
Errors for PROCEDURE EMP_EXP:

LINE/COL ERROR
-------- -----------------------------------------------------------------
5/1      PLS-00103: Encountered the symbol "SELECT" when expecting one of
         the following:
         begin function package pragma procedure subtype type use
         <an identifier> <a double-quoted delimited-identifier> form
         current cursor
         The symbol "begin" was substituted for "SELECT" to continue.

6/26     PLS-00103: Encountered the symbol "end-of-file" when expecting
         one of the following:
         begin case declare end exception exit for goto if loop mod
         null pragma raise return select update while with

LINE/COL ERROR
-------- -----------------------------------------------------------------
         <an identifier> <a double-quoted delimited-identifier>
         <a bind variable> << close current delete fetch lock insert
         open rollback savepoint set sql execute commit forall merge
         pipe

SQL> ed
Wrote file afiedt.buf

  1  create procedure emp_exp(empid in number,exp out number,empname out varchar)
  2  is
  3  todaysDate date;
  4  doj date;
  5  begin
  6  select sysdate into todaysDate from dual;
  7  select hiredate,emp_name into doj,empname from emp where emp_id=empid;
  8  exp:=(todaysDate-doj)/365;
  9* end
SQL> /
create procedure emp_exp(empid in number,exp out number,empname out varchar)
                 *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> ed
Wrote file afiedt.buf

  1  create procedure emp_exp_proc(empid in number,exp out number,empname out varchar)
  2  is
  3  todaysDate date;
  4  doj date;
  5  begin
  6  select sysdate into todaysDate from dual;
  7  select hiredate,emp_name into doj,empname from emp where emp_id=empid;
  8  exp:=(todaysDate-doj)/365;
  9* end
SQL> /

Warning: Procedure created with compilation errors.

SQL> show errors
Errors for PROCEDURE EMP_EXP_PROC:

LINE/COL ERROR
-------- -----------------------------------------------------------------
9/3      PLS-00103: Encountered the symbol "end-of-file" when expecting
         one of the following:
         ; <an identifier> <a double-quoted delimited-identifier>
         delete exists prior <a single-quoted SQL string>
         The symbol ";" was substituted for "end-of-file" to continue.

SQL> ed
Wrote file afiedt.buf

  1  create procedure emp_exp_proc(empid in number,exp out number,empname out varchar)
  2  is
  3  todaysDate date;
  4  doj date;
  5  begin
  6  select sysdate into todaysDate from dual;
  7  select hiredate,emp_name into doj,empname from emp where emp_id=empid;
  8  exp:=(todaysDate-doj)/365;
  9* end;
SQL> /
create procedure emp_exp_proc(empid in number,exp out number,empname out varchar)
                 *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> ed
Wrote file afiedt.buf

  1  create or replace procedure emp_exp_proc(empid in number,exp out number,empname out varchar)
  2  is
  3  todaysDate date;
  4  doj date;
  5  begin
  6  select sysdate into todaysDate from dual;
  7  select hiredate,emp_name into doj,empname from emp where emp_id=empid;
  8  exp:=(todaysDate-doj)/365;
  9* end;
SQL> /

Warning: Procedure created with compilation errors.

SQL> show errors
Errors for PROCEDURE EMP_EXP_PROC:

LINE/COL ERROR
-------- -----------------------------------------------------------------
7/1      PL/SQL: SQL Statement ignored
7/58     PL/SQL: ORA-00904: "EMP_ID": invalid identifier
SQL> desc emp_data;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMP_ID                                    NOT NULL NUMBER(10)
 EMP_NAME                                           VARCHAR2(20)
 SAL                                                NUMBER(10,4)
 HIREDATE                                           DATE

SQL> ed
Wrote file afiedt.buf

  1  create or replace procedure emp_exp_proc(empid in number,exp out number,empname out varchar)
  2  is
  3  todaysDate date;
  4  doj date;
  5  begin
  6  select sysdate into todaysDate from dual;
  7  select hiredate,emp_name into doj,empname from emp_data where emp_id=empid;
  8  exp:=(todaysDate-doj)/365;
  9* end;
SQL> /

Procedure created.

SQL>