-- 
-- Copyright (c) 2023, Promineo Tech
-- Author:  Promineo Tech Academic Team
-- Subject:  MySQL SHOW, DESCRIBE, SELECT, WHERE, LIKE, ORDER BY, etc.
-- MySQL Week 07 Lab
--

--	In most RDBMSs: SCHEMA vs. DATABASE
--			schema: a collection of tables
--			database: a collection of schemas
--	 
--	A schema can also be described like this:
--			- it can mean either a visual data representation
--			- a set of rules it is subject to, or 
--			- a complete set of objects owned by a particular user
--	A database is any collection of data. 
--
--		The data in a database is usually organized in such a way that the information is easily accessible.
--		A schema is basically a formal description of how a database is formed and where everything is located. 
--		It works as a blueprint that shows where everything is in the database and how it is structured.
--
--		In contrast with all other RDBMSs, MySQL, the words schema and database are synonymous
-- 
--			For our course, we use MySQL.  MySQL, an Open Source SQL database management system, is 
--			developed, distributed, and supported by Oracle Corporation.
--
--			The MySQL website (http://www.mysql.com/) provides the latest information about MySQL software.

--		Because schema and database are synonymous in MySQL, we will use the word database here.
--   -------------------------------------------------------------------------
-- 		week07MySQLLab BEGINS HERE
--   -------------------------------------------------------------------------
-- Show all of the databases on your system
-- Hint:  SHOW DATABASES command
show databases;

-- Get to know the database:
-- Specify that this script will use the sakila database
use sakila;

-- Retrieve the list of tables in the sakila database
show tables;
-- Show whether a table is a View or a Base Table
show full tables;

-- Write SQL statements to show the columns in the following tables:
-- 		1. customer
describe customer;
-- 		2. film
describe film;


-- 1.  Write MySQL queries to retrieve information from the 
--			customer table in the sakila database
--  1a.	Retrieve all data from customers, but only show 10 rows.
select * from customer LIMIT 10;

--  1b. Retrieve all data from films, 
--			a. with a rental_rate less than or equal to 1.00
--  		b. with a replacement_cost less than or equal to 10.00
select * from film WHERE rental_rate <= 1.00 AND replacement_cost <= 10.00;

-- 1c.  Copy and Modify the above query (1b) and add the restriction that
--			we only want films that start with 'N'
select * from film WHERE rental_rate <= 1.00 AND replacement_cost <= 10.00 AND title LIKE 'N%';

-- 1d. Retrieve all films that are less than 90 minutes long 
-- 			have a PG rating and have a description including a 'Boat"
select * from film where length < 90 and rating = 'PG' and description like '%Boat%';

-- 1e.  Now retrieve the movie title, and  the actors that are in that list of movies.
select film.title as "Title", CONCAT(actor.first_name, " ", actor.last_name) as "Actor" from film
inner join film_actor USING (film_id)
inner join actor USING (actor_id)
where length < 90 and rating = 'PG' and description like '%Boat%';




-- 2.  Write MySQL queries to retrieve information from the 
--			customer table in the sakila database
-- 
-- 	2a.	Retrieve all the information on all customers 
--		whose last name that starts with the letter 'A'
select * from customer 
where last_name like 'A%';

--	2b. Copy & Modify the above query (2a)
--		to retrieve information on all customers
--		whose last name that starts with the letter 'A'
--		and sort them in order of the customer id
select * from customer 
where last_name like 'A%'
order by customer_id;



--   -------------------------------------------------------------------------
-- 		END OF week07MySQLLab
--   -------------------------------------------------------------------------


