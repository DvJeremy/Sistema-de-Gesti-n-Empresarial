-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 19-11-2021 a las 04:46:58
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `plazavea`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_Empleado` int(11) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Genero` varchar(50) NOT NULL,
  `Puesto_Trabajo` varchar(50) NOT NULL,
  `Estado_Civil` varchar(50) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Fecha_Nacimiento` varchar(50) NOT NULL,
  `Jornada_Trabajo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_Empleado`, `Nombre`, `Apellido`, `Genero`, `Puesto_Trabajo`, `Estado_Civil`, `Correo`, `Telefono`, `Direccion`, `Fecha_Nacimiento`, `Jornada_Trabajo`) VALUES
(1, 'Joel', 'Cahuana', 'masculino', 'Gerente de tienda', 'Soltero', 'joel@gmail.com', '1234567', 'SJL', '02/ 08/ 1999', 'Full time'),
(2, 'Christian', 'Alvarado', 'masculino', 'Sub gerente', 'casado', 'chris@gmail.com', '5751849', 'SMP', '02/ 10/ 2001', 'Part time'),
(4, 'Jeremy', 'Bustamante', 'masculino', 'Supervisora de cajas', 'Soltero', 'jeremy@unfv', '7654321', 'jiron puno', '01/ 02/ 1998', 'Full time'),
(5, 'James', 'Chambi', 'masculino', 'Analista', 'casado', 'James@unfv', '9632145', 'Jiron union ', '01/ 04/ 1998', 'Full time'),
(6, 'Carlos', 'Matos', 'masculino', 'Sub gerente', 'casado', 'carlos@unfv', '9874561', 'sjl', '01/ 02/ 1993', 'Part time'),
(7, 'Luz', 'Flores', 'femenino', 'Analista', 'casado', 'luz@unfv', '6321456', 'calle 14', '01/ 04/ 1998', 'Peak time'),
(8, 'Fernanada', 'Casas', 'femenino', 'Supervisor de tienda', 'Soltero', 'fer@unfv', '9874561', 'duraznos calle2', '01/ 03/ 1998', 'Full time'),
(9, 'Nicolas', 'Casas', 'masculino', 'Supervisora de cajas', 'Soltero', 'nicolas@unfv', '1234567', 'jiron union', '01/ 02/ 1986', 'Full time');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `Descripcion` varchar(50) DEFAULT NULL,
  `Stock` int(11) DEFAULT NULL,
  `PrecioU` double DEFAULT NULL,
  `CostoTotal` double DEFAULT NULL,
  `PrecioV` double DEFAULT NULL,
  `Fecha_entrega` varchar(50) DEFAULT NULL,
  `Fecha_vencimiento` varchar(50) DEFAULT NULL,
  `ID_Proveedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `Descripcion`, `Stock`, `PrecioU`, `CostoTotal`, `PrecioV`, `Fecha_entrega`, `Fecha_vencimiento`, `ID_Proveedor`) VALUES
(1234, 'Leche', 1000, 8, 8000, 10, '01/ 01/ 2021', '01/ 06/ 2021', 100),
(1235, 'Mantequilla', 1200, 4, 4800, 6, '01/ 01/ 2021', '06/ 07/ 2021', 100),
(1236, 'Leche', 500, 6, 3000, 8, '01/ 01/ 2021', '03/ 04/ 2021', 101),
(1237, 'Leche', 500, 6, 3000, 7, '01/ 01/ 2021', '01/ 06/ 2021', 103),
(1238, 'Mantequilla', 800, 4, 3200, 5, '01/ 01/ 2021', '01/ 08/ 2021', 101),
(1239, 'Yogurt', 1200, 6, 7200, 7, '01/ 01/ 2021', '04/ 01/ 2021', 100),
(1240, 'Yogurt', 800, 5, 4000, 6, '01/ 01/ 2021', '01/ 06/ 2021', 101),
(1241, 'Yogurt', 600, 5, 3000, 6, '01/ 01/ 2021', '01/ 04/ 2021', 103);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `ID_Proveedor` int(11) NOT NULL,
  `RUC` varchar(50) NOT NULL,
  `Empresa` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ID_Proveedor`, `RUC`, `Empresa`, `Telefono`) VALUES
(100, '20100190797', 'Gloria', '4282481'),
(101, '20100095450', 'Laive', '6187600'),
(102, '20263322496', 'Nescafe', '8001021'),
(103, '20100305870', 'Ideal', '7894561'),
(104, '20263322496', 'Nestle', '080010210');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `username` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `recuperacion` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`username`, `contraseña`, `recuperacion`) VALUES
('jeremy', '31', 123),
('joel', '12', 123);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_Empleado`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `ID_Proveedor` (`ID_Proveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ID_Proveedor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`username`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`ID_Proveedor`) REFERENCES `proveedor` (`ID_Proveedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
