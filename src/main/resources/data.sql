INSERT INTO user (firstname, lastname, gender, age, email, role, password, username) VALUES 
	('Jean','Ducellier','homme',23,'jeanducellier@gmail.com','ADMIN','$2a$10$k.gGzFaNHZWqtK1/Rlacj.e7S1xHhH0QgA5zEqg8zWx6C0qSjluE.','superadmin');

INSERT INTO spectacle (title, date_show,legal_age,tarif) VALUES 
	('Inglorious Robot','23-02-20',3,12.50);
	
INSERT INTO article (title, content, picture, spectacle_id) VALUES
	('Viendez voir des circuit de reves !','blabla bla bla','https://media.ldlc.com/r1600/ld/products/00/04/94/74/LD0004947497_2.jpg',1);
	
INSERT INTO groupe (name, description, picture, spectacle_id) VALUES 
	('Les MecanoTube','bla bla blablablablablabla','#https://maZWumbada',1);