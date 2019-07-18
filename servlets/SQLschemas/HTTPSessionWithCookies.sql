--------------------------------------------------------
--  File created - Thursday-July-18-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table REG_FORM_DATA
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."REG_FORM_DATA" 
   (	"ID" NUMBER primary key, 
	"NAME" VARCHAR2(100 BYTE), 
	"FNAME" VARCHAR2(100 BYTE), 
	"PHONENO" VARCHAR2(10 BYTE), 
	"EMAIL" VARCHAR2(100 BYTE), 
	"QUAL" VARCHAR2(100 BYTE), 
	"YEAR" DATE, 
	"UNIV" VARCHAR2(20 BYTE), 
	"SKILL" VARCHAR2(50 BYTE), 
	"EXP" NUMBER(10,0), 
	"SAL" VARCHAR2(20 BYTE), 
	"LOC" VARCHAR2(100 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Index SYS_C004292
--------------------------------------------------------

