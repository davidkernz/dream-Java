-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  ven. 04 mars 2022 à 02:56
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP :  7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `hlapaixdavidkernizan`
--

-- --------------------------------------------------------

--
-- Structure de la table `entreprises`
--

CREATE TABLE `entreprises` (
  `ID` int(11) NOT NULL,
  `IDGroupe` int(11) NOT NULL,
  `NomEntreprise` varchar(50) NOT NULL,
  `NomPropriétaire` varchar(25) NOT NULL,
  `PrénomProprietaire` varchar(25) NOT NULL,
  `SexeProprietaire` varchar(25) NOT NULL,
  `AdresseProprietaire` varchar(50) NOT NULL,
  `TéléphoneProprietaire` varchar(25) NOT NULL,
  `TypePièceProprietaire` varchar(25) NOT NULL,
  `NoPièceProprietaire` varchar(50) NOT NULL,
  `DateCréationEntreprise` varchar(50) NOT NULL,
  `Description` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `gestionprêts`
--

CREATE TABLE `gestionprêts` (
  `ID` int(11) NOT NULL,
  `IDGroupe` int(11) NOT NULL,
  `MontantEmprunté` double NOT NULL,
  `Intérêt` double NOT NULL,
  `VersementMensuel` double NOT NULL,
  `Date Pret` varchar(50) NOT NULL,
  `DateVersement1` varchar(50) NOT NULL,
  `DateVersement2` varchar(50) NOT NULL,
  `DateVersement3` varchar(50) NOT NULL,
  `DateVersement4` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `groupe_emprunteur`
--

CREATE TABLE `groupe_emprunteur` (
  `ID` int(11) NOT NULL,
  `COMMUNE` varchar(100) NOT NULL,
  `DATECREATION` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `groupe_emprunteur`
--

INSERT INTO `groupe_emprunteur` (`ID`, `COMMUNE`, `DATECREATION`) VALUES
(1, 'Belladere', '2022-02-10'),
(2, 'Boucan Carré', '2022-02-10'),
(3, 'Cerca Carvajal', '2022-02-10'),
(4, 'Cerca la Source', '2022-02-10'),
(5, 'Hinche', '2022-02-10'),
(6, 'Lascahobas', '2022-02-10'),
(7, 'Maïssade ', '2022-02-10'),
(8, 'Mirebalais', '2022-02-10'),
(9, 'Savanette', '2022-02-10'),
(10, 'Saut d\'Eau', '2022-02-10'),
(11, 'Thomassique', '2022-02-10'),
(12, 'Thomonde', '2022-02-10');

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

CREATE TABLE `login` (
  `nom` varchar(20) NOT NULL,
  `pass` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `login`
--

INSERT INTO `login` (`nom`, `pass`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Structure de la table `remboursements`
--

CREATE TABLE `remboursements` (
  `ID` int(11) NOT NULL,
  `IDPrêts` int(11) NOT NULL,
  `NomVersement` varchar(50) NOT NULL,
  `MontantRemboursé` double NOT NULL,
  `DateRemboursement` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `entreprises`
--
ALTER TABLE `entreprises`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_foreign Key` (`IDGroupe`);

--
-- Index pour la table `gestionprêts`
--
ALTER TABLE `gestionprêts`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_foreign Key1` (`IDGroupe`);

--
-- Index pour la table `groupe_emprunteur`
--
ALTER TABLE `groupe_emprunteur`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `remboursements`
--
ALTER TABLE `remboursements`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_foreign Key2` (`IDPrêts`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `entreprises`
--
ALTER TABLE `entreprises`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT pour la table `gestionprêts`
--
ALTER TABLE `gestionprêts`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT pour la table `groupe_emprunteur`
--
ALTER TABLE `groupe_emprunteur`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `remboursements`
--
ALTER TABLE `remboursements`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `entreprises`
--
ALTER TABLE `entreprises`
  ADD CONSTRAINT `FK_foreign Key` FOREIGN KEY (`IDGroupe`) REFERENCES `groupe_emprunteur` (`ID`);

--
-- Contraintes pour la table `gestionprêts`
--
ALTER TABLE `gestionprêts`
  ADD CONSTRAINT `FK_foreign Key1` FOREIGN KEY (`IDGroupe`) REFERENCES `groupe_emprunteur` (`ID`);

--
-- Contraintes pour la table `remboursements`
--
ALTER TABLE `remboursements`
  ADD CONSTRAINT `FK_foreign Key2` FOREIGN KEY (`IDPrêts`) REFERENCES `gestionprêts` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
