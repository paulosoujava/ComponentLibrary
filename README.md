# Biblioteca de componentes

## Atom
 Cada componente do `JETPACK COMPOSE` será um atomo em nossa biliboteca, ou seja,
 Text, CircularProgress, CircularAvatar.
 `IMPORTANTE` vamos desconsiderar os agredadores, containers, tais como:
 Card, Column, Row, Scafold, etc.. ex:
 ```sh
  Text{}
 ```
 
 ## Molecule
 A junção de dois ou mais atomos será considerado molecula, ex:
 ```sh
Card{
    Column{
        Icon{}
        Text{}
    }
}
```

## Organisms
 em organismo você pode ter atomo, molecula, e até outros organimos, porém isso pode
 deixar algo que deve ser simples, muito complexo, ex:

```sh
 fun MyLogin{
     MoleculeCard{
         AtomText{
         }
     }
 }
```

## Template
Os templates são modelos dos quais chamamos os Organismos, podemos também usar os, atomos, moleculas, resaltando, não gere complexidade em ago que pode ser simples, não chame template dentro de template... mas nada te impede de fazer isto, você pode ter templates para diferentes tamanhos ex:
TemplateLoginTablet, TemplateLoginMobile etc...

## Page
E seguindo vamos para as PAGES, que serão as nossas páginas, aqui você desenha a sua
pagina, pode usar os Cards, Columns, Organisms, moleculas, atoms...

!!Observação
A aplicabilidade dele se asemelha ao design pattern Abstract Factory, que é um padrão de projeto criacional onde permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas. Porém como estamos falando de funcões compostas, poderiamos compara-las as classes 
concretas, onde o nosso enum fara o papel das fabricas, gerando os estilos (familias)...


<img src="https://raw.githubusercontent.com/paulosoujava/ComponentLibrary/main/app/src/main/res/drawable/design%20atomic.png" width="648">

