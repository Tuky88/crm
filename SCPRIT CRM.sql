INSERT INTO `mydb`.`tipo_usuario` (`idTipo_Usuario`, `descripcion`) VALUES ('1', 'VENDEDOR');
INSERT INTO `mydb`.`tipo_usuario` (`idTipo_Usuario`, `descripcion`) VALUES ('2', 'ADMIN');

INSERT INTO `mydb`.`usuario` (`idUsuario`, `usuario`, `nombre`, `correo`, `estatus`, `password`, `fk_tipo_usuario`) VALUES ('1', 'treyes', 'Antonio', 'treyes@crm.com', '1', '1234', '1');
INSERT INTO `mydb`.`usuario` (`idUsuario`, `usuario`, `nombre`, `correo`, `estatus`, `password`, `fk_tipo_usuario`) VALUES ('2', 'areyes', 'Axel', 'areyes@crm.com', '1', '1234', '1');
INSERT INTO `mydb`.`usuario` (`idUsuario`, `usuario`, `nombre`, `correo`, `estatus`, `password`, `fk_tipo_usuario`) VALUES ('3', 'agutierrez', 'Angel', 'agutierrez@crm.com', '1', '1234', '1');

ALTER TABLE `mydb`.`usuario` 
CHANGE COLUMN `idUsuario` `id_usuario` INT NOT NULL AUTO_INCREMENT ;