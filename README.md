
OneBitCode

    Sobre
    Contato

    Home
    Outros
    Como criar um README incrível para seus projetos (e perfil) no Github

Como criar um README incrível para seus projetos (e perfil) no Github
README GITHUB

Programador(a), como está o README dos seus projetos no Github?

Ter um bom README pode aumentar suas chances de conseguir sua super vaga de programação quando um recrutador visitar o seu perfil, aumentar o uso das ferramentas que você criou e disponibilizou lá ou simplesmente fazer o dia a dia da sua equipe mais fácil na hora de usar um projeto (através das instruções deixadas lá)

Neste tutorial você vai aprender como criar um README de qualidade que vai melhorar a visibilidade e compreensão do seus projetos no Github.

Também teremos um BÔNUS ensinando como realizar um README próprio pro seu perfil do Github, ou seja, uma página de apresentação profissional no Github para que toda nova visita em seu perfil possa saber mais sobre você. Incrível, não?!

Mas você sabe o que é o README??

O README nada mais é que um arquivo de apresentação. É o “primeiro passo” ao abrir um novo projeto, seja pra ver a documentação, dicas essenciais que precisa saber para rodar o projeto, descrição de seu projeto, etc. Tudo isso pode e deve ser adicionado no README!

Um outro detalhe importante, o README é um arquivo markdown (.md), o markdown é uma linguagem de marcação que serve para apresentar informações de forma organizada (como o HTML).

E de forma similar ao HTML, o markdown também possui Tags, vamos comparar alguns exemplos:

 

HTML:
Vim
<h1>Olá</h1>
<h2>Tudo bem com você?!</h2>
<h3>Estamos aqui!</h3>

<ol>
<li>a</li>
<li>b</li>
<li>c</li>
</ol>
1
2
3
4
5
6
7
8
9
	
<h1>Olá</h1>
<h2>Tudo bem com você?!</h2>
<h3>Estamos aqui!</h3>
 
<ol>
<li>a</li>
<li>b</li>
<li>c</li>
</ol>

 

Markdown:
Vim
# Olá
## Tudo bem com você?!
### Estamos aqui!

1. a
2. b
3. c
1
2
3
4
5
6
7
	
# Olá
## Tudo bem com você?!
### Estamos aqui!
 
1. a
2. b
3. c

 

Nesse artigo, então, iremos:

    Aprender como organizar, construir e estruturar um Readme estiloso e de fácil entendimento.
    Construir um Readme de apresentação para seu perfil no Github! (BÔNUS)


Então, sem mais enrolação, bora lá!

 

Passo a passo

1. Por padrão, muitos projetos já vem com um arquivo README.md (como no caso de projetos Ruby On Rails).
Caso você não possua nenhum projeto ainda, crie um repositório no Github, crie um arquivo README.md e suba os códigos para lá.
Se você estiver em um projeto Ruby On Rails, ao abrir o README.md dele no Github você deve ver algo como:


 

2. Vamos clicar na caneta, na direção do título “README.md”, para editar o arquivo. Ele se apresentará da seguinte forma:

3. Então, vamos substituir pela seguinte estrutura:
Default
![Logo of the project](http://logo_link)

## Name_of_the_project

... Description


## Technology 

Here are the technologies used in this project.

* Ruby version  x.x.x
* Rails version x.x.x
* ...


## Services Used

* Github
* ...


## Ruby Gems
...

## Getting started

* To install gems:
>    $ bundle install
* To create the bank and do as migrations:
>    $ rake db:create db:migrate db:seed
* To run the project:
>    $ rails s

## How to use

Here will be the images and descriptions. Principal content.


## Features

  - Here will be the features.


## Links

  - Link of deployed application: (if has been deployed)
  - Repository: https://link_of_repository
    - In case of sensitive bugs like security vulnerabilities, please contact
      YOUR EMAIL directly instead of using issue tracker. We value your effort
      to improve the security and privacy of this project!


## Versioning

1.0.0.0


## Authors

* **YOUR NAME**: @YOUR_GITHUB_NICKNAME (https://github.com/YOUR_GITHUB_NICKNAME)


Please follow github and join us!
Thanks to visiting me and good coding!
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
	
![Logo of the project](http://logo_link)
 
## Name_of_the_project
 
... Description
 
 
## Technology 
 
Here are the technologies used in this project.
 
* Ruby version  x.x.x
* Rails version x.x.x
* ...
 
 
## Services Used
 
* Github
* ...
 
 
## Ruby Gems
...
 
## Getting started
 
* To install gems:
>    $ bundle install
* To create the bank and do as migrations:
>    $ rake db:create db:migrate db:seed
* To run the project:
>    $ rails s
 
## How to use
 
Here will be the images and descriptions. Principal content.
 
 
## Features
 
  - Here will be the features.
 
 
## Links
 
  - Link of deployed application: (if has been deployed)
  - Repository: https://link_of_repository
    - In case of sensitive bugs like security vulnerabilities, please contact
      YOUR EMAIL directly instead of using issue tracker. We value your effort
      to improve the security and privacy of this project!
 
 
## Versioning
 
1.0.0.0
 
 
## Authors
 
* **YOUR NAME**: @YOUR_GITHUB_NICKNAME (https://github.com/YOUR_GITHUB_NICKNAME)
 
 
Please follow github and join us!
Thanks to visiting me and good coding!

4. Repare que nessa estrutura precisaremos dos seguintes itens:
– Logo do projeto.
– Prints das telas principais do projeto.

5. A boa impressão sempre parte do visual de nossas apresentações, e o primeiro contato que o recrutador ou a pessoa alvo terá se deparando com nosso projeto, então mãos na massa e bora lá!!

Para as logos, particularmente gosto de gerar no link abaixo:

https://pt.freelogodesign.org

 

6. Entrando no endereço, você deve digitar o nome do seu projeto, o ramo e clicar no botão “iniciar”:

 

7. Assim, abrirá uma tela com uma listagem de logos prontos para serem personalizados e utilizados. É só escolher o que mais gostou e clicar em “Adicionar”.

 

8. Personalizando, é só clicar em “Finalizar”, no canto direito superior!!

 

9. Aqui, clique em “Baixa resolução” para baixar gratuitamente. Aí é só digitar seu nome e email e a logo vai direto pra sua caixa de email!

 

10. Show!! Agora vamos tirar alguns prints das principais telas do nosso projeto! Rode o seu projeto em desenvolvimento e tire alguns prints, mas capriche bem!

Uma ferramenta muito boa para auxiliar nesse processo é o LightShot. Você pode baixá-lo no link abaixo:

https://app.prntscr.com/pt-br/download.html

11. Com as imagens capturadas, vamos ver o que temos:

 

12. Agora vamos no nosso projeto e adicione essas imagens em alguma pasta no nosso repositório. Para isso, particularmente gosto de deixar uma pasta chamada readme_images dentro da pasta public.

Bom, entre na pasta escolhida, no repositório do Github, e selecione Add file > upload files.

13. Arraste as imagens que obtivemos para essa pasta.

 

14. Assim que tudo for carregado, role a página até a parte inferior e clique em commit changes.

15. Você será redirecionado para a página principal. Vamos entrar na pasta que realizamos o upload. Ela terá que mostrar os arquivos salvos.

 

16. Abra a imagem da sua logo e copie a URL. Ela será importante no nosso readme.


17. Volte na raiz de nosso projeto e clique no ícone da caneta do nosso readme, no README.md, e vamos editá-lo novamente:

 
Mãos na massa!

18. Substitua:

Default
![Logo of the project](https://logo_link)
1
	
![Logo of the project](https://logo_link)

Pela URL da sua logo, dentro da pasta que fizemos o upload.


Deve ficar com o seguinte formato:

 

19. Agora vamos substituir as informações genéricas por informações de nosso projeto:

Obs: Nesse passo será um bônus se você preencher as informações em inglês. Sendo linguagem universal, além de mostrar que você possui domínio na língua, ainda torna seu portfólio universal, tendo maior alcance!

 

20. Em How to Use iremos adicionar os prints que tiramos. Aqui será adicionado o conteúdo principal, o ouro do nosso projeto. Aqui faremos a identidade visual do nosso readme. Deixe-o mais ou menos no seguinte formato:

 

21. Em Features você vai adicionar tudo o que seu projeto faz. Ressalte as qualidades dele e mostre o potencial do projeto:

 

22. Em Links, substitua o link do seu repositório e adicione o link do deploy. Como o nosso projeto não possui deploy, vamos deixá-lo nesse formato:

 

23. Por fim, em Authors, substitua com suas informações. O nosso ficou desse jeito aqui:

 

24. A segunda parte de nosso readme ficou no seguinte formato:

 

25. E é isso!!! Role a página para baixo, e clique em “commit changes”.
Você será redirecionado para a página do seu Readme e se parecerá com o seguinte formato:



Bônus (README de perfil)!!!!!!

26. O Github lançou uma atualização para uma melhor apresentação do seu perfil na plataforma.

27. Primeiro, crie um repositório com as seguintes configurações:

28. Em repository name coloque o seu nome de usuário do Github. Coloque ele Público e inicializando com o Readme. Assim, clique em “create repository”.

29. Seu repositório se parecerá com o conteúdo abaixo:

 

30. Clique para editar o README e cole o seguinte conteúdo:

(Lembre-se de substituir as variáveis “link_do_seu_perfil_no_github”, “link_do_seu_perfil_no_linkedin”, “seu_telefone_55+DDD+número_de_telefone” e “seu_email” pelos seus dados pessoais correspondentes às variáveis).
Default
<img align="right" width="400" height="400" src="coloque_o_link_de_uma_foto_ou_gif_aqui">

# Welcome!

## I'm SEU NOME AQUI!

… Insira suas descrições aqui!


## About me 
[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white&link=link_do_seu_perfil_no_github)](link_do_seu_perfil_no_github)
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=link_do_seu_perfil_no_linkedin)](link_do_seu_perfil_no_linkedin)
[![Whatsapp Badge](https://img.shields.io/badge/-Whatsapp-4CA143?style=flat-square&labelColor=4CA143&logo=whatsapp&logoColor=white&link=https://api.whatsapp.com/send?phone=seu_telefone_55+DDD+número_de_telefone&text=Hello!)](https://api.whatsapp.com/send?phone=seu_telefone_55+DDD+número_de_telefone&text=Hello!)
[![Gmail Badge](https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:seu_email)](mailto:seu_email)

- Thanks for visiting. 

- Enjoy it!! o/
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
	
<img align="right" width="400" height="400" src="coloque_o_link_de_uma_foto_ou_gif_aqui">
 
# Welcome!
 
## I'm SEU NOME AQUI!
 
… Insira suas descrições aqui!
 
 
## About me 
[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white&link=link_do_seu_perfil_no_github)](link_do_seu_perfil_no_github)
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=link_do_seu_perfil_no_linkedin)](link_do_seu_perfil_no_linkedin)
[![Whatsapp Badge](https://img.shields.io/badge/-Whatsapp-4CA143?style=flat-square&labelColor=4CA143&logo=whatsapp&logoColor=white&link=https://api.whatsapp.com/send?phone=seu_telefone_55+DDD+número_de_telefone&text=Hello!)](https://api.whatsapp.com/send?phone=seu_telefone_55+DDD+número_de_telefone&text=Hello!)
[![Gmail Badge](https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:seu_email)](mailto:seu_email)
 
- Thanks for visiting. 
 
- Enjoy it!! o/
____________________________________

# Bem Vindo!

## Meu nome é Alain L. Mota

Um Professor em física, entusiasta e autodidata em programação, robótica, programação e eletrônica!


## Sobre mim 
[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white&link=https://github.com/AlainMota)]
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=www.linkedin.com/in/alain-mota-a61319117)]
[![Whatsapp Badge](https://img.shields.io/badge/-Whatsapp-4CA143?style=flat-square&labelColor=4CA143&logo=whatsapp&logoColor=white&link=https://api.whatsapp.com/send?phone=98984137126&text=Hello!)]
[![Gmail Badge](https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=alainmota9@gmail.com)]

- Obrigado pela visita. 


## Remove Atalhos
![Logo of the project](https://github.com/AlainMota/Remove-Atalhos/blob/main/logo.png)

Este projeto foi desenvolvido com o objetivo de remover o vírus de pendrive, responsável por ocultar os arquivos e criar uma série de atalhos, além disso ele permite a restauração dos arquivos originais, bem como a eliminação de todos os atalhos.

## Tecnologia 

Aqui estão as tecnologias utilizadas neste projeto.

*Java SE 8


## Serviços Usados

* Github


## Começando
Projetos de software livre descontinuado


## Recursos

  - Remove o vírus com extensão .vbs.
  - Remove os atalhos criado no pendrive.
  - Desoculta os arquivos originais.


## Links

  - Link da aplicação desenvolvida: https://github.com/AlainMota/Remove-Atalhos/blob/main/REMOVE_2.0.jar
  - Repository: https://github.com/AlainMota/Remove-Atalhos
   
## Controle de versão

2.0.0.0


## Autor

* **Alain L. Mota**: @AlainMota (https://github.com/AlainMota)

Obrigado pela Visita!
