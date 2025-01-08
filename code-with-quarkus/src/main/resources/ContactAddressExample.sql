CREATE DATABASE IF NOT EXISTS `contact_address`;
USE `contact_address`;
CREATE TABLE IF NOT EXISTS `contact_model` (
  `uuid` VARCHAR(1024),
  `id_address` VARCHAR(1024),
  `name` VARCHAR(1024),
  `first_name` VARCHAR(1024),
  `email` VARCHAR(1024),
  `personal_phone` BIGINT,
  `job` VARCHAR(1024),
  `work_phone` BIGINT
);

INSERT INTO `contact_model` (`uuid`,`id_address`,`name`,`first_name`,`email`,`personal_phone`,`job`,`work_phone`)
VALUES
('a8dff5c7-8d88-4fcb-jklo-e4a09de05e36','a8dff5c7-8d88-4fcb-8d24-e4a09de05e36','Dupont','Jean','jean.dupont@example.com',601020304,'Développeur',140234567),
('ecb9d879-9a9b-4d85-jklo-5867e827efb9','ecb9d879-9a9b-4d85-b0b2-5867e827efb9','Martin','Sophie','sophie.martin@example.com',612345678,'Responsable RH',148765432),
('c3f207fa-6327-4d62-jklo-7ac621af68f9','c3f207fa-6327-4d62-9d56-7ac621af68f9','Lemoine','Pierre','pierre.lemoine@example.com',634567890,'Chef de projet',132456789),
('b4c8a9c2-e524-4f59-jklo-054b73057465','b4c8a9c2-e524-4f59-9f91-054b73057465','Leblanc','Claire','claire.leblanc@example.com',622334455,'Marketing Manager',145667788),
('a1b08f23-84b9-4eac-jklo-97c7cd1fd0c1','a1b08f23-84b9-4eac-9483-97c7cd1fd0c1','Pires','Lucas','lucas.pires@example.com',701020304,'Développeur Backend',150234567),
('b4f9a7da-0b09-4e42-jklo-06be4327f1e4','b4f9a7da-0b09-4e42-81c4-06be4327f1e4','Tremblay','Alice','alice.tremblay@example.com',712345678,'Chef de produit',178765432),
('c8bb4f84-d394-40c9-jklo-9b292f27f4ff','c8bb4f84-d394-40c9-b215-9b292f27f4ff','Fournier','Éric','eric.fournier@example.com',722334455,'Directeur technique',132345678);

CREATE TABLE IF NOT EXISTS `address_model` (
  `uuid` VARCHAR(1024),
  `number` BIGINT,
  `street` VARCHAR(1024),
  `postal_code` BIGINT,
  `city` VARCHAR(1024),
  `country` VARCHAR(1024),
  `address_complement` VARCHAR(1024),
  `additional_information` VARCHAR(1024)
);

INSERT INTO `address_model` (`uuid`,`number`,`street`,`postal_code`,`city`,`country`,`address_complement`,`additional_information`)
VALUES
('a8dff5c7-8d88-4fcb-8d24-e4a09de05e36',10,'Rue des Acacias',75001,'Paris','France','Appartement 12','Résidence sécurisée'),
('ecb9d879-9a9b-4d85-b0b2-5867e827efb9',25,'Avenue de la République',69001,'Lyon','France','Bâtiment B','Près du parc'),
('c3f207fa-6327-4d62-9d56-7ac621af68f9',45,'Boulevard de la Liberté',13001,'Marseille','France','Escalier A','Immeuble ancien'),
('b4c8a9c2-e524-4f59-9f91-054b73057465',3,'Place des Vosges',75003,'Paris','France','Rez-de-chaussée','Boutique en façade'),
('a1b08f23-84b9-4eac-9483-97c7cd1fd0c1',15,'Avenue des Champs-Élysées',75008,'Paris','France','Appartement 5','Immeuble moderne'),
('b4f9a7da-0b09-4e42-81c4-06be4327f1e4',100,'Rue de la Paix',69002,'Lyon','France','Bâtiment A','Près du centre commercial'),
('c8bb4f84-d394-40c9-b215-9b292f27f4ff',75,'Boulevard Haussmann',75009,'Paris','France','3ème étage','Immeuble bien situé');