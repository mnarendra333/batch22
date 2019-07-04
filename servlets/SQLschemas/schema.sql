RegApp:
=====================================
Tables:
-------
CREATE TABLE "SYSTEM"."REGST_TAB" 
   (	"ID" NUMBER(10,0), 
	"FIRSTNAME" VARCHAR2(20 BYTE), 
	"LASTNAME" VARCHAR2(20 BYTE), 
	"GENDER" VARCHAR2(10 BYTE), 
	"CITY" VARCHAR2(20 BYTE), 
	"DOB" DATE, 
	"ADDRESS" VARCHAR2(20 BYTE), 
	"HOBBIES" VARCHAR2(20 BYTE), 
	"SKILLS" VARCHAR2(20 BYTE)
   )

Sequence:
--------
create sequence regst_seq start with 1001 increment by 1;

