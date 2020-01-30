INSERT INTO user (firstname, lastname, gender, age, email, role, password, username) VALUES 
	('Jean','Ducellier','homme',23,'jeanducellier@gmail.com','ADMIN','$2a$10$k.gGzFaNHZWqtK1/Rlacj.e7S1xHhH0QgA5zEqg8zWx6C0qSjluE.','superadmin');

INSERT INTO spectacle (title, date_show,legal_age,tarif, picture, priority, description) VALUES 
	('Inglorious Robot','23-02-20',3,12.50, 'https://www.francetvinfo.fr/image/759r9ph9a-d9d5/1200/450/10621617.jpg', 1, 'Inglorious robot est un spectale interactif et evolutif dans lequel tout les spectateurs sont convié a interagir avec des intelligence artificiels, afin de montrer la réalité sur la robotique, l intelligence artificiel ,... ' ),
	('A la recherche de l Hyper Sex by Bender','23-03-20',22,10.40, 'https://pic.clubic.com/v1/images/1674746/raw', 2, 'Le spectacle s appuie sur des archives de films X des années 1970 et 1980, d après les narrateurs récemment déclassifiées par le Federal Bureau of Investigation. Il s agit d une comédie revenant sur une intervention de la Confédération intergalactique sur Terre après la disparition de la matrice sexuelle universelle, l Ultra-Sex, qui gère la libido des humains et des robots'),
	('Le Seigneur des anneaux : Un boulon pour les gouverner tous','23-02-21',2,12,'https://www.media.lamontagnesolitaire.fr/media/articles/Amazon-Lord-of-the-Rings-TV-Show-Header.jpg',2,'blabla'),
	('Star Wars Remastered by JarJarBot ','24-01-21',0,23,'http://fr.web.img3.acsta.net/c_640_256/newsv7/17/02/20/15/31/167447.jpg',2,'Bien plus qu’un spectacle, Star Wars Remastered by JarJarBot vous offre un tout nouveau genre d’expérience, créée par la Hoax Compagnie. Voyez des Robots et des humains de classe mondiale s’emparer du futur avec grâce pour y accomplir des prouesses qui défient les lois de l univers. Une performance audacieuse et inattendue de la HoaxCompagnie, qui promet son lot de sensations fortes, le tout bercé par le space opéra du mythique star wars !!!');

	INSERT INTO article (title, content, picture, spectacle_id) VALUES
	('Un Mot du réalisateur',"'Hé, est-ce-que je viens te gonfler quand t’es raide déchiré dans le caniveau ? Non ? Alors barre-toi… \n Quoi toujours là ? vous voulez un conseille ? \n   C est facile tu sais c est comme faire l amour : gauche, bas, rotation 62 degrés, engagement rotor.'",'/img/benderrea.png',2),
	('Des GROS composants de très très très près !',"HOT HOT HOT",'https://amiens-lelab.fr/wp-content/uploads/2019/02/composant-pc-gamer.jpg',2),
	('Poussée au vis',' ','https://cdn.manomano.com/boulon-vendu-avec-ecrou-tete-hexagonale-th-18x200-acier-zing-blanc-unitaire-P-156145-2223010_1.jpg',2),
	('Des pièces ... Sexy !','blabla bla bla','https://media.ldlc.com/r1600/ld/products/00/04/94/74/LD0004947497_2.jpg',2),
	('Un mot du réalisateur',"' Kara Bimboum limousine Big boss '",'https://fr.web.img4.acsta.net/newsv7/19/11/28/15/19/3757858.jpg',4),
	('Embarquez pour une nouvelle aventure ! ','Nos amis les droids sont  bien décidé a vous faire voyager!','https://soutien.profexpress.com/wp-content/uploads/2018/01/r2d2.jpg',4),
	('Dans une galaxie pas si lointaine ...','blabla bla blablabla bla blablabla bla blablabla bla blablabla bla blablabla bla blablabla bla bla','https://pic.clubic.com/v1/images/1725572/raw?width=1200&fit=max&hash=e5b750a0376a14381a2a16408683b0d181bd0eaf',4);
	
INSERT INTO groupe (name, description, picture, spectacle_id) VALUES 
	('Bender','Vous présentent un numéro avec un cigare, une bouteille de jack et vos portefeuilles ...','https://pbs.twimg.com/profile_images/2210226383/bender.jpg',2),
	('Les MecanoTube',"Vous présentent leur numéro 'Chérie j'ai dévissé les gosses' un numéro assez osé rempli de magie ...",'https://www.lavisserie.fr/modules//smartblog/images/x21-single-default.jpg.pagespeed.ic.swfg9rzIZk.webp',2),
	('BlueRay','Un spectacle acrobatique entre deux lecteurs qui s echange leurs disques ...','https://www.howtogeek.com/wp-content/uploads/2019/08/x1-7.png.pagespeed.gp+jp+jw+pj+ws+js+rj+rp+rw+ri+cp+md.ic.cHlY-X6puU.jpg',2),
	('Les MecanoTube','bla bla blablablablablabla','#https://maZWumbada',4),
	('Les MecanoTube','bla bla blablablablablabla','#https://maZWumbada',4),
	('Les MecanoTube','bla bla blablablablablabla','#https://maZWumbada',4);