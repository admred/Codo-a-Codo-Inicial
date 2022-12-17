CREATE TABLE datos_alumnos (
    id          INT,
    nombre      VARCHAR(40) NOT NULL,
    apellido    VARCHAR(40) NOT NULL,
    id_curso    INT         NOT NULL,
    PRIMARY KEY (id) AUTOINCREMENT,
    FOREIGN KEY (id_curso) REFERENCES TO datos_curros(id)
);

CREATE TABLE datos_cursos(
    id              INT,
    nombre          VARCHAR(40),
    docente         VARCHAR(40),
    dias_cursados   INT,
    PRIMARY KEY (id) AUTOINCREMENT
);


INSERT INTO datos_cursos (id,cursos,nombre,docente,dias_cursados) VALUES
    (NULL,'JAVA','Juan Aguirre','Mar y Jue'),
    (NULL,'PYTHON','Lucas Romero','Lu y Mie')
    (NULL,'PHP','Jimena Andrada','Jue y Vie');

INSERT INTO datos_alumnos(id,nombre,apellido,id_curso) VALUES
    (NULL,'Juan',' Perez',2),
    (NULL,'Mariza','Boedo',1)
    (NULL,'Victoria','Funez',3);


SELECT datos_cursos.docente,datos_alumnos.apellido,datos_alumnos.nombre /* columas que va mostrar  */
    FROM datos_cursos  JOIN datos_alumnos                               /* las tablas involucradas */
    WHERE datos_alumnos.id_curso=datos_cursos.id                        /* las claves involucradas */
    GROUP BY datos_alumnos.docente ORDER BY datos_alumnos.docente ASC;  /* agrupacion y ordenamito de los resultados */