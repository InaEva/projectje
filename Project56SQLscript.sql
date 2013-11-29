-- Database: "Testproject56"

-- DROP DATABASE "Testproject56";


  CREATE DATABASE "Testproject56"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Dutch_Netherlands.1252'
       LC_CTYPE = 'Dutch_Netherlands.1252'
       CONNECTION LIMIT = -1;
       
CREATE TABLE Vacature
(
VacatureID int(10),
BedrijfID int(10),
DatumPlaatsing varchar(20),
VacatureCategorie varchar(50),
Functie varchar(50),
Aantal uur int(10),
Omschrijving varchar(150),
PRIMARY KEY(VacatureID)

);

CREATE TABLE Bedrijf
(
BedrijfID		int(10),
Bedrijfsnaam		varchar(20),
Adres			varchar(25),
Postcode		varchar(7),
Plaats			varchar(50),
Telefoon		varchar(10),
Contactpersoon		varchar(25),
SoortGebruiker		varchar(20),
PRIMARY KEY(BedrijfID)
);

CREATE TABLE CurriculumVitea
(
CVID			int(10),
SollicitantID		int(10),
Functie			varchar(25),
Opleidingen		varchar(300),
Specialiteiten		varchar(300),
JarenErvaring		int(4),
PRIMARY KEY(CVID)
);

CREATE TABLE Sollicitant
(
SollicitantID		int(10),
Naam			varchar(25),
Achternaam		varchar(25),
Adres			varchar(25),
Postcode		varchar(7),
Plaats			varchar(50),
Telefoon		varchar(10),
EMail			varchar(80),
SoortGebruiker		varchar(20),
PRIMARY KEY(SollicitantID)
);