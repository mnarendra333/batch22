Vendor.java
Customer.java
hibernate.cfg.xml
Client.java

================================
 console logs
 ===============================
 Hibernate: drop table Customer cascade constraints
Hibernate: drop table Vendor cascade constraints
Hibernate: create table Customer (custId number(10,0) not null, address varchar2(30), custName varchar2(20), vendor_id number(10,0), primary key (custId))
Hibernate: create table Vendor (venId number(10,0) not null, address varchar2(30), venName varchar2(20), primary key (venId))
Hibernate: alter table Customer add constraint FK_sdwi9e9q846cijc8ee5o733rr foreign key (vendor_id) references Vendor
Aug 12, 2019 9:17:28 AM org.hibernate.tool.hbm2ddl.SchemaExport execute
INFO: HHH000230: Schema export complete
Hibernate: select customer_.custId, customer_.address as address2_0_, customer_.custName as custName3_0_ from Customer customer_ where customer_.custId=?
Hibernate: select customer_.custId, customer_.address as address2_0_, customer_.custName as custName3_0_ from Customer customer_ where customer_.custId=?
Hibernate: select customer_.custId, customer_.address as address2_0_, customer_.custName as custName3_0_ from Customer customer_ where customer_.custId=?
Hibernate: insert into Vendor (address, venName, venId) values (?, ?, ?)
Hibernate: insert into Customer (address, custName, custId) values (?, ?, ?)
Hibernate: insert into Customer (address, custName, custId) values (?, ?, ?)
Hibernate: insert into Customer (address, custName, custId) values (?, ?, ?)
Hibernate: update Customer set vendor_id=? where custId=?
Hibernate: update Customer set vendor_id=? where custId=?
Hibernate: update Customer set vendor_id=? where custId=?

=============================================================
JOINS
==============================================================
CREATE TABLE "SYSTEM"."IPL_TEAMS" 
   (	"TEAM_ID" NUMBER(10,0), 
	"TEAM_NAME" VARCHAR2(20 BYTE), 
	"CITY" VARCHAR2(20 BYTE), 
	"OWNER" VARCHAR2(20 BYTE)
   )
 ALTER TABLE "SYSTEM"."IPL_TEAMS" ADD PRIMARY KEY ("TEAM_ID");  
   
CREATE TABLE "SYSTEM"."PLAYERS" 
   (	"PLY_ID" NUMBER(10,0), 
	"PLY_NAME" VARCHAR2(20 BYTE), 
	"PLY_TYPE" VARCHAR2(20 BYTE), 
	"PLY_AGE" NUMBER(10,0), 
	"RUNS" NUMBER(10,0), 
	"WKTS" NUMBER(10,0), 
	"T_ID" NUMBER(10,0)
   )
 ALTER TABLE "SYSTEM"."PLAYERS" ADD PRIMARY KEY ("PLY_ID");
 
ALTER TABLE "SYSTEM"."PLAYERS" ADD FOREIGN KEY ("T_ID")
	  REFERENCES "SYSTEM"."IPL_TEAMS" ("TEAM_ID") ENABLE;
=============================================================
QUERIES::
=====================================
SELECT P.PLY_NAME,T.TEAM_NAME,P.PLY_AGE FROM IPL_TEAMS T INNER JOIN PLAYERS P ON (T.TEAM_ID==P.T_ID);


SELECT P.PLY_NAME,T.TEAM_NAME,P.PLY_AGE FROM IPL_TEAMS T LEFT JOIN PLAYERS P ON (T.TEAM_ID=P.T_ID);

SELECT P.PLY_NAME,T.TEAM_NAME,P.PLY_AGE FROM IPL_TEAMS T RIGHT JOIN PLAYERS P ON (T.TEAM_ID=P.T_ID);

 SELECT P.PLY_NAME,T.TEAM_NAME,P.PLY_AGE FROM IPL_TEAMS T FULL JOIN PLAYERS P ON (T.TEAM_ID=P.T_ID);