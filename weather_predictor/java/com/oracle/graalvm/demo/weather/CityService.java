/**
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 * This file is made available under version 3 of the GNU General Public License.
 */
package com.oracle.graalvm.demo.weather;

import java.util.Arrays;

public class CityService {
    private static City[] cities = new City[] {
        new City(0, "Novovolyns'k", "Ukraine", 52720, 50.73, 24.17, 20.16),
        new City(1, "La Sabana", "Honduras", 1572, 15.37, -87.93, 23.58),
        new City(2, "Videbaek", "Denmark", 4076, 56.08, 8.63, 18.51),
        new City(3, "Nasirabad", "Pakistan", 28506, 27.38, 67.91, 29.46),
        new City(4, "Okazaki", "Japan", 355573, 34.96, 137.16, 22.01),
        new City(5, "Huddersfield", "UK", 149607, 53.66, -1.8, 17.24),
        new City(6, "Cocentaina", "Spain", 11223, 38.75, -0.44, 28),
        new City(7, "Ankathia", "Greece", 1300, 40.56, 22.47, 25.91),
        new City(8, "Mediesu Aurit", "Romania", 7062, 47.78, 23.15, 23),
        new City(9, "Juan Lopez", "Dominican Republic", 1547, 19.43, -70.52, 15),
        new City(10, "Birnin Kebbi", "Nigeria", 111883, 12.46, 4.19, 30.26),
        new City(11, "Chistopol", "Russia", 62020, 55.36, 50.64, 24.11),
        new City(12, "Periyialion", "Greece", 2120, 37.95, 22.84, 35.27),
        new City(13, "Togo", "Japan", 42643, 35.1, 137.04, 29),
        new City(14, "Shiyan", "China", 413581, 32.57, 110.78, 25.91),
        new City(15, "Iira", "Estonia", 138, 58.99, 24.72, 18.8),
        new City(16, "Ilha Soltera", "Brazil", 25305, -20.38, -51.34, 25.11),
        new City(17, "Ikorodu", "Nigeria", 321809, 6.61, 3.51, 28),
        new City(18, "Kocani", "Macedonia", 34448, 41.93, 22.4, 32.99),
        new City(19, "Siatista", "Greece", 5603, 40.26, 21.54, 31),
        new City(20, "Pella", "Greece", 2482, 40.76, 22.52, 18.56),
        new City(21, "Villeurbanne", "France", 132282, 45.77, 4.88, 25.73),
        new City(22, "Kalgoorlie-Boulder", "Australia", 37806, -30.74, 121.46, 17.69),
        new City(23, "Amelia", "Italy", 11886, 42.56, 12.41, 29.55),
        new City(24, "San Roque", "N. Mariana Islands", 1097, 15.25, 145.77, 25.26),
        new City(25, "'Ar'ara", "Israel", 15841, 32.49, 35.1, 31.92),
        new City(26, "Roshal", "Russia", 21806, 55.67, 39.88, 25.21),
        new City(27, "Jalaun", "India", 56651, 26.15, 79.35, 30.46),
        new City(28, "Huckeswagen", "Germany", 16311, 51.15, 7.34, 18.47),
        new City(29, "Yosu", "Korea South", 361480, 34.74, 127.74, 24.36),
        new City(30, "Miastko", "Poland", 10839, 54, 16.97, 16.51),
        new City(31, "Sao Joao da Talha", "Portugal", 19180, 38.82, -9.07, 29.48),
        new City(32, "Hat'", "Czech Republic", 2525, 49.95, 18.25, 21),
        new City(33, "Aruja", "Brazil", 75758, -23.4, -46.34, 17.78),
        new City(34, "Ussimae", "Estonia", 215, 59.34, 26.38, 15.71),
        new City(35, "Fache-Thumesnil", "France", 16113, 50.59, 3.07, 19.01),
        new City(36, "Hassel", "Luxembourg", 437, 49.55, 6.21, 20.75),
        new City(37, "Tatui", "Brazil", 95351, -23.35, -47.86, 22.16),
        new City(38, "Brookfield", "USA", 40323, 43.06, -88.12, 16.44),
        new City(39, "Bendorf", "Germany", 17637, 50.43, 7.57, 20.44),
        new City(40, "Kemman", "Marshall Islands", 6, 7.1, 171.57, 29),
        new City(41, "Subic", "Philippines", 69280, 14.88, 120.23, 24),
        new City(42, "Savaia", "Samoa", 395, -13.93, -171.93, 26.65),
        new City(43, "Savitaipale", "Finland", 4164, 61.2, 27.7, 16),
        new City(44, "Gandzak", "Armenia", 3823, 40.31, 45.11, 32),
        new City(45, "Deir Hanna", "Israel", 8551, 32.87, 35.36, 34.95),
        new City(46, "Sangrur", "India", 91250, 30.25, 75.84, 30.91),
        new City(47, "Athens", "Greece", 1649, 40.81, 22.7, 34.35),
        new City(48, "Csabrendek", "Hungary", 2935, 47.02, 17.3, 20.01),
        new City(49, "Elizabeth", "USA", 124552, 40.67, -74.19, 18.77),
        new City(50, "Ustrzyki Dolne", "Poland", 9608, 49.43, 22.61, 16.61),
        new City(51, "al-Fasir", "Sudan", 264734, 13.63, 25.35, 36.51),
        new City(52, "Matara", "Sri Lanka", 43346, 5.96, 80.53, 27.96),
        new City(53, "Barrancas", "Colombia", 17811, 10.96, -72.79, 28.46),
        new City(54, "Meilen", "Switzerland", 11649, 47.28, 8.63, 22.66),
        new City(55, "Timbauba", "Brazil", 45375, -7.5, -35.32, 27),
        new City(56, "Kasaoka", "Japan", 58297, 34.52, 133.52, 19.86),
        new City(57, "Joacaba", "Brazil", 23894, -27.17, -51.5, 21.56),
        new City(58, "Wahlern", "Switzerland", 6225, 46.82, 7.35, 24.14),
        new City(59, "Igra", "Russia", 21957, 57.56, 53.04, 23.61),
        new City(60, "Paistu", "Estonia", 344, 58.27, 25.62, 19),
        new City(61, "Ashqelon", "Israel", 107188, 31.67, 34.56, 31.71),
        new City(62, "Vana-Koiola", "Estonia", 104, 57.96, 27.05, 18),
        new City(63, "Schwechat", "Austria", 15778, 48.14, 16.5, 21.69),
        new City(64, "Avigliana", "Italy", 12184, 45.1, 7.38, 27.7),
        new City(65, "Lyskovo", "Russia", 23465, 56.03, 45.04, 20.01),
        new City(66, "El Cerrito", "Colombia", 38943, 3.69, -76.31, 24),
        new City(67, "Tyulkubas", "Kazakhstan", 12177, 42.55, 70.25, 29),
        new City(68, "Boynton Beach", "USA", 67720, 26.53, -80.08, 28.66),
        new City(69, "Yancheng", "China", 631805, 33.39, 120.12, 25.41),
        new City(70, "Ecully", "France", 19548, 45.77, 4.75, 25.74),
        new City(71, "Pasichna", "Ukraine", 4489, 48.57, 24.41, 20),
        new City(72, "Kazan", "Turkey", 25838, 40.23, 32.68, 25),
        new City(73, "Agios Thomas", "Cyprus", 31, 34.72, 32.73, 30.42),
        new City(74, "Gwoza", "Nigeria", 15417, 11.08, 13.7, 33.11),
        new City(75, "East Kilbride", "UK", 74543, 55.77, -4.18, 16.35),
        new City(76, "Airdrie", "UK", 35330, 55.87, -3.99, 16.33),
        new City(77, "Hizan", "Turkey", 16379, 38.22, 42.43, 40),
        new City(78, "Walhain", "Belgium", 6091, 50.62, 4.7, 17.29),
        new City(79, "Hulja", "Estonia", 566, 59.35, 26.21, 15.71),
        new City(80, "Bishop's Stortford", "UK", 39937, 51.88, 0.15, 18.08),
        new City(81, "Nonsan", "Korea South", 44284, 36.2, 127.09, 25.3),
        new City(82, "Santa Cruz do Sul", "Brazil", 108678, -29.71, -52.44, 25.91),
        new City(83, "Huaicheng", "China", 94801, 33.51, 119.14, 26.56),
        new City(84, "Kushtiya", "Bangladesh", 139580, 23.91, 89.14, 27.86),
        new City(85, "Wardha", "India", 114306, 20.75, 78.6, 29),
        new City(86, "Vigan", "Philippines", 49127, 17.56, 120.37, 22.51),
        new City(87, "Nagold", "Germany", 22854, 48.55, 8.73, 22.7),
        new City(88, "Maroslele", "Hungary", 2147, 46.27, 20.34, 25),
        new City(89, "East Brunswick", "USA", 48799, 40.43, -74.42, 19.87),
        new City(90, "Zabok", "Croatia", 2876, 46.03, 15.92, 20.26),
        new City(91, "Izumi", "Japan", 39126, 32.08, 130.35, 27),
        new City(92, "Ylamaa", "Finland", 1381, 60.8, 28, 16),
        new City(93, "Grado", "Spain", 10978, 43.4, -6.08, 21),
        new City(94, "Norodepil", "Faroe Islands", 169, 62.3, -6.52, 12),
        new City(95, "Schleswig", "Germany", 23945, 54.54, 9.55, 19.8),
        new City(96, "Cromwell", "New Zealand", 2981, -45.05, 169.23, 16.33),
        new City(97, "Addis 'Alem", "Ethiopia", 10088, 9.04, 38.39, 20),
        new City(98, "Khurja", "India", 107759, 28.26, 77.85, 30.91),
        new City(99, "Zhongshu", "China", 92839, 24.53, 103.76, 16.76),
        new City(100, "Pauastvere", "Estonia", 141, 58.67, 26.01, 18),
        new City(101, "Mokhotlong", "Lesotho", 9362, -29.29, 29.07, 9.86),
        new City(102, "Sidi Amran", "Algeria", 30906, 33.5, 6.02, 27.56),
        new City(103, "Carangola", "Brazil", 25480, -20.74, -42.04, 16.66),
        new City(104, "Thaba-Tseka", "Lesotho", 5510, -29.54, 28.6, 9.86),
        new City(105, "Bolshevik", "Tajikistan", 6628, 37.43, 68.68, 13.51),
        new City(106, "Soini", "Finland", 2647, 62.87, 24.22, 14.11),
        new City(107, "Laupheim", "Germany", 19128, 48.24, 9.88, 17.75),
        new City(108, "al-Qaysumah", "Saudi Arabia", 21060, 28.31, 46.13, 49),
        new City(109, "Woyang", "China", 79791, 31.99, 116.23, 23),
        new City(110, "Halayhay", "Philippines", 10951, 14.37, 120.81, 25),
        new City(111, "Khalastra", "Greece", 7373, 40.63, 22.73, 33),
        new City(112, "Strumica", "Macedonia", 45645, 41.43, 22.66, 27.91),
        new City(113, "Fengzhen", "China", 73005, 40.45, 113.14, 17.81),
        new City(114, "Metskula", "Estonia", 123, 58.57, 22.55, 18.67),
        new City(115, "Ugarcin", "Bulgaria", 2909, 43.1, 24.42, 24.01),
        new City(116, "Uster", "Switzerland", 28811, 47.36, 8.71, 20.79),
        new City(117, "Utmanzai", "Pakistan", 30177, 34.18, 71.77, 29.71),
        new City(118, "Phuentsholing", "Bhutan", 17884, 26.85, 89.38, 18.56),
        new City(119, "Bilbao", "Spain", 350782, 43.25, -2.93, 21.84),
        new City(120, "Bago", "Philippines", 78983, 10.55, 122.86, 26),
        new City(121, "Chauk", "Myanmar", 92906, 20.9, 94.82, 27.01),
        new City(122, "Mozonte", "Nicaragua", 2380, 13.65, -86.45, 22.51),
        new City(123, "Demirozu", "Turkey", 1837, 40.16, 39.89, 32),
        new City(124, "Kuldiga", "Latvia", 13214, 56.98, 21.95, 20),
        new City(125, "Pirgos", "Greece", 1142, 35, 25.15, 18),
        new City(126, "Malyi", "Hungary", 4110, 48.02, 20.83, 20.86),
        new City(127, "Braila", "Romania", 212307, 45.28, 27.97, 25),
        new City(128, "Centenary", "Zimbabwe", 3522, -16.8, 31.12, 21.11),
        new City(129, "Denny", "UK", 9493, 56.02, -3.88, 16.5),
        new City(130, "Havran", "Turkey", 11193, 39.56, 27.1, 31),
        new City(131, "Andradas", "Brazil", 27303, -22.07, -46.57, 16),
        new City(132, "Mjolby", "Sweden", 11504, 58.33, 15.13, 20.62),
        new City(133, "Grande-Saline", "Haiti", 1810, 19.25, -72.78, 26.79),
        new City(134, "Agua Prieta", "Mexico", 70230, 31.33, -109.56, 19),
        new City(135, "Idappadi", "India", 52345, 11.58, 77.85, 25.01),
        new City(136, "Ayodhya", "India", 54202, 26.8, 82.2, 29.31),
        new City(137, "Mfum", "Nigeria", 9223, 5.85, 8.8, 18.61),
        new City(138, "Xonobod", "Uzbekistan", 32975, 40.52, 72.38, 30),
        new City(139, "'Ali al Garbi", "Iraq", 20370, 32.46, 46.68, 41.71),
        new City(140, "Katwe", "Uganda", 5892, -0.13, 29.92, 26),
        new City(141, "Algete", "Spain", 18907, 40.61, -3.51, 38.38),
        new City(142, "Dobele", "Latvia", 11161, 56.63, 23.27, 20),
        new City(143, "Ilhavo", "Portugal", 17379, 40.6, -8.66, 29.71),
        new City(144, "Yerevan", "Armenia", 2237, 40.14, 45.19, 32),
        new City(145, "Rendeux", "Belgium", 2355, 50.23, 5.5, 17),
        new City(146, "La Motte-Servolex", "France", 13859, 45.6, 5.88, 26.48),
        new City(147, "Yesilhisar", "Turkey", 14491, 38.35, 35.09, 32.51),
        new City(148, "San Juan de Rio Coco", "Nicaragua", 3980, 13.55, -86.17, 20),
        new City(149, "Ponta Grossa", "Brazil", 297444, -25.09, -50.16, 19.16),
        new City(150, "Mataria", "Egypt", 100709, 31.17, 32.02, 18),
        new City(151, "Buttisholz", "Switzerland", 2923, 47.1, 8.1, 22.99),
        new City(152, "South Shields", "UK", 83783, 55, -1.43, 16.55),
        new City(153, "Patika", "Estonia", 171, 59.32, 24.91, 17),
        new City(154, "Kogalym", "Russia", 58694, 62.03, 74.5, 17.11),
        new City(155, "Schonenberg", "Switzerland", 1885, 47.2, 8.63, 23.93),
        new City(156, "Karavete", "Estonia", 294, 59.19, 25.75, 17),
        new City(157, "Florence-Graham", "USA", 63012, 33.97, -118.24, 18.76),
        new City(158, "Akkol", "Kazakhstan", 4266, 48.78, 53.2, 18.21),
        new City(159, "Tamboril", "Dominican Republic", 23753, 19.48, -70.6, 28.05),
        new City(160, "Sant Pere de Ribes", "Spain", 26597, 41.27, 1.77, 28.02),
        new City(161, "Vekso", "Denmark", 1914, 55.75, 12.25, 19.03),
        new City(162, "Jarmina", "Croatia", 2643, 45.32, 18.73, 23.43),
        new City(163, "Balingasag", "Philippines", 9878, 8.74, 124.78, 26.41),
        new City(164, "Yoro", "Japan", 32858, 35.31, 136.56, 24.01),
        new City(165, "Solone", "Ukraine", 7238, 48.22, 34.87, 25.61),
        new City(166, "Kralupy nad Vltavou", "Czech Republic", 17279, 50.25, 14.31, 19),
        new City(167, "Corsier", "Switzerland", 1700, 46.27, 6.22, 25.94),
        new City(168, "Bondy", "France", 48473, 48.91, 2.47, 22.33),
        new City(169, "Kljajicevo", "Serbia and Montenegro", 6151, 45.77, 19.28, 24),
        new City(170, "Eiken", "Switzerland", 1957, 47.53, 7.98, 23.43),
        new City(171, "Sigriswil", "Switzerland", 4328, 46.72, 7.7, 23.65),
        new City(172, "Salama", "Honduras", 1779, 15.75, -85.97, 24.11),
        new City(173, "Suceava", "Romania", 105525, 47.64, 26.26, 21),
        new City(174, "Pomerode", "Brazil", 22569, -26.75, -49.18, 21),
        new City(175, "Codo", "Brazil", 85176, -4.48, -43.88, 32.31),
        new City(176, "Sorata", "Bolivia", 2192, -15.79, -68.66, 18.01),
        new City(177, "Chik Ballapur", "India", 58529, 13.47, 77.73, 23),
        new City(178, "Villanueva de la Canada", "Spain", 14511, 40.45, -4, 38.37),
        new City(179, "Jati", "Indonesia", 87061, -6.84, 110.81, 31.11),
        new City(180, "Ermsdorf", "Luxembourg", 230, 49.82, 6.22, 20.19),
        new City(181, "Malmedy", "Belgium", 11548, 50.42, 6.03, 19.83),
        new City(182, "Malolos", "Philippines", 203511, 14.85, 120.81, 24.49),
        new City(183, "Garleni", "Romania", 6235, 46.67, 26.8, 24),
        new City(184, "Goeblange", "Luxembourg", 436, 49.66, 5.96, 20.17),
        new City(185, "Kayfan", "Kuwait", 28807, 29.32, 48.05, 46),
        new City(186, "Krasnogorsk", "Russia", 93079, 55.83, 37.33, 22.5),
        new City(187, "Saint-Louis", "Reunion", 48542, -21.27, 55.41, 31.01),
        new City(188, "Stayner", "Canada", 4156, 44.42, -80.08, 18),
        new City(189, "Habikino", "Japan", 121412, 34.56, 135.61, 27),
        new City(190, "Esgeran", "Azerbaijan", 1651, 39.94, 46.83, 18),
        new City(191, "Ashgabat", "Turkmenistan", 32144, 42.33, 59.14, 33),
        new City(192, "Veldhoven", "Netherlands", 42058, 51.39, 5.38, 17.78),
        new City(193, "Calafell", "Spain", 20247, 41.21, 1.56, 27.99),
        new City(194, "Salpazari", "Turkey", 10910, 40.94, 39.2, 26),
        new City(195, "Petite Riviere", "Mauritius", 5452, -20.18, 57.43, 23),
        new City(196, "Allada", "Benin", 20638, 6.65, 2.15, 29),
        new City(197, "Santa Rosa", "Colombia", 10683, 10.45, -75.37, 25),
        new City(198, "La Virtud", "Honduras", 1341, 14.05, -88.7, 26.26),
        new City(199, "Gecitkale", "Cyprus", 3231, 35.26, 33.73, 35.47),
        new City(200, "Barcelona", "Spain", 1591485, 41.4, 2.17, 27.5),
        new City(201, "Berlin", "El Salvador", 11492, 13.5, -88.53, 20.51),
        new City(202, "Berlin", "Germany", 3378275, 52.52, 13.38, 20.51),
        new City(203, "Brno", "Czech Republic", 365771, 49.2, 16.61, 21.25),
        new City(204, "Cape Town", "South Africa", 3546429, -33.93, 18.46, 14.51),
        new City(205, "Dublin", "Ireland", 1030431, 53.33, -6.25, 16.28),
        new City(206, "London", "UK", 7489022, 51.52, -0.1, 18.69),
        new City(207, "Los Angeles", "USA", 3911500, 34.11, -118.41, 18.84),
        new City(208, "Madrid", "Spain", 3146804, 40.42, -3.71, 38.37),
        new City(209, "New York", "USA", 8124427, 40.67, -73.94, 18.5),
        new City(210, "Paris", "France", 2141839, 48.86, 2.34, 22.33),
        new City(211, "Prague", "Czech Republic", 1168374, 50.08, 14.43, 19),
        new City(212, "Rome", "Italy", 2561181, 41.89, 12.5, 25.74),
        new City(213, "San Diego", "USA", 1299352, 32.81, -117.14, 20.54),
        new City(214, "San Francisco", "USA", 723724, 37.77, -122.45, 15.75),
        new City(215, "San Jose", "USA", 897883, 37.3, -121.85, 13.21)
    };

    public int getTotalCount() { return cities.length; }
    public City[] getAll() { return cities; }
    public City[] getAllPaged(int skip, int pageSize) {
        return Arrays.stream(cities).skip(skip).limit(pageSize).toArray(n -> new City[n]);
    }

    public City findByName(String name) {
        System.out.println("Finding city by name " + name);
        return Arrays.stream(cities).filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }

    public void updateTemperature(int id, double temperature) {
        cities[id].updateTemperature(temperature);
    }
}
