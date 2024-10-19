CREATE TABLE Persons(
    Id INTEGER PRIMARY KEY,
    FirstName TEXT(200) NOT NULL,
    LastName TEXT(200) NOT NULL,
    Age INTEGER
);

INSERT INTO Persons(Id, FirstName, LastName, Age)
VALUES (1, 'Jānis', 'Bērziņš', 19),
(2, 'Juris', 'Bērziņš', 22);

SELECT * FROM Persons;

SELECT Persons.FirstName, Persons.Lastname, Persons.Age 
FROM Persons;

SELECT * FROM Persons
WHERE Persons.Age < 20;

CREATE TABLE Pets(
    Id INTEGER PRIMARY KEY,
    Name TEXT NOT NULL,
    Type TEXT NOT NULL,
    PersonId INTEGER,
    FOREIGN KEY (PersonId) REFERENCES Persons(Id)
);


INSERT INTO Pets(Id, Name, Type, PersonId)
VALUES(1, 'Muris', 'Kaķis', 2),
(2, 'Rembo', 'Suns', 1);

SELECT * FROM Pets;

INSERT INTO Pets(Id, Name, Type, PersonId)
VALUES(3, 'Rodžers', 'Kāmis', 1),
(4, 'Reksis', 'Suns', 2);

SELECT Pets.Name, Persons.FirstName, Persons.LastName 
FROM Pets, Persons
WHERE Pets.PersonId = Persons.Id
ORDER BY Persons.FirstName desc;
