INSERT INTO qh.permissao(
                                  permissao,
                                  descricao)
                           VALUES(
                                   'ROLE_CADASTROUSUARIO',
                                   'CADASTRO DE NOVOS USUÁRIOS');
 
INSERT INTO qh.permissao(
                                  permissao,
                                  descricao)
                           VALUES(
                                   'ROLE_CONSULTAUSUARIO',
                                   'CONSULTA DE USUÁRIOS');                                   
 
INSERT INTO qh.permissao(
                                  permissao,
                                  descricao)
                           VALUES(
                                   'ROLE_ADMIN',
                                   'ADMINISTRAÇÃO COMPLETA');
INSERT INTO qh.grupo(
                             nome,
                             descricao) 
                      VALUES(
                              'ADMINISTRADORES', 
                              'Administrador');
 
INSERT INTO qh.grupo(
                             nome,
                             descricao) 
                      VALUES(
                              'USUARIOS', 
                              'Usuários Comum');
 
INSERT INTO qh.grupo(
                             nome,
                             descricao) 
                      VALUES(
                              'BACKOFFICE', 
                              'Backoffice - Cadastros');
INSERT INTO qh.usuario (
                                nome,
                                login,
                                senha,
                                ativo)
                        VALUES(
                                'CPD',
                                '1234',
'$2a$10$ZMWvxfvjwpRjTN.xhMFv5egw6UKsrn8fii02DsyQ6k.Oo4H.NQtdy',
                                 true);
/*ROLE_CADASTROUSUARIO x BACKOFFICE*/
INSERT INTO qh.grupo_permissao(permissao_id,grupo_id)VALUES(1,3); 
 
/*ROLE_CONSULTAUSUARIO x USUARIOS*/
INSERT INTO qh.grupo_permissao(permissao_id,grupo_id)VALUES(2,2);
 
/*ROLE_ADMIN x ADMINISTRADORES*/
INSERT INTO qh.grupo_permissao(permissao_id,grupo_id)VALUES(3,1);

INSERT INTO qh.usuario_grupo(usuario_id,grupo_id)VALUES(1,1); 

INSERT INTO qh.instituicao(nome,organizacao,diretor,inep,cnpj)VALUES('Teste','ORG','DIR','1234','4321')