# ITI 1521 - Lab 03

## Submission

Veuillez lire les [instructions junit](JUNIT.fr.md) pour obtenir
de l'aide avec l'exécution des tests pour ce laboratoire.

Veuillez lire attentivement les [Directives de soumission](SUBMISSION.fr.md).
Les erreurs de soumission affecteront vos notes.

Soumettez les réponses aux

* Utils.java
* Rational.java


## Objectifs d'apprentissage

* **Distinguer** « == » et « equals ».
* **Manipuler** des tableaux et des références.
* Utiliser des tests prédéfinis
* Approfondir les notions liées à la programmation orientée objet
* Résoudre des problèmes à l'aide de Java
* Expliquer en vos propres mots JavaDoc
* Représenter vos commentaires à l'aide de JavaDoc
* Produire des pages Web à partir de spécifications JavaDoc

## 1. La méthode **equals**

Comme vous le savez, la classe **Object** déclare une méthode **[equals](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-)**.

```java
public class Object {

    // ...

    public boolean equals(Object obj) {
        return this == other;
    }

}
```

Puisqu'en Java, toutes les classes héritent des caractéristiques de la classe **Object**. Toutes les classes possèdent donc une méthode **boolean equals(Object obj)**. C'est vrai pour les classes prédéfinies, mais aussi pour toutes les classes que l'on crée soi-même.

On utilise la méthode **equals** afin de comparer les objets désignés par des **variables références**. Étant donné deux variables référence **a** et **b**, et les objets désignés:

* Pour comparer l'identité des objets (est-ce que **a** et **b** désignent le même objet ou non?), on utilise l'opérateur de comparaison «**==**» (donc «**a == b**»);
* Pour comparer le **contenu** des deux objets (est-ce que le **contenu** des objets désignés est logiquement équivalent?), on utilise la méthode «**equals**» (donc **a.quals(b)**).

## 2. Manipulation des tableaux - FindAndReplace

Complétez l'implémentation de la méthode de classe (static) **String[] findAndReplace(String[] in, String[] what, String[] with)** de la classe **Utils**. Cette méthode retourne une <u>copie</u> du tableau désigné par la référence **in** où tous les mots se trouvant le tableau désigné par **what** ont été remplacés par le mot se trouvant à la même position dans le tableau **with**. Le tableau désigné par **in** demeure <u>inchangé</u> par un appel à la méthode. Il n'y a pas des doublons dans le tableau **what**.

Plus tard, nous traiterons les exceptions. Il s'agit d'un formalisme pour le traitement d'erreurs. En attendant, la méthode **findAndReplace** retourne la valeur **null** lorsque l'un de ces préalables n'est pas rencontré:

*   En particulier, la valeur des paramètres formels ne peut être **null**.
*   La valeur des éléments des tableaux ne peut être **null**.
*   Les tableaux désignés par les références **what** et **with** doivent être de même longueur.

Vous allez **soumettre cet exercice**. Téléchargez et complétez le fichier de démarrage ici:

* Utils.java

### Utilisation de tests pour valider des programmes

Bien que les tests démontrent la présence et non l'absence d'erreurs («_testing shows the presence, not the absence of bugs_» - Edsger W. Dijkstra), la validation des programmes est une activité importante du développement de logiciels.

Les tests sont une partie essentielle du développement de logiciels. Il est donc important de se familiariser à les utiliser. Bien qu’il soit possible de tester de petits programmes manuellement, plus votre programme est complexe, plus l’utilisation de test automatique est importante. Le principe des tests automatiques est de créer un bloc de code —un test— qui interagit avec votre programme en effectuant un ou plusieurs scénarios possibles dont on connait la réponse logique, et de s’assurer que la réponse de notre programme correspond à la réponse logique que l’on s’attend à obtenir. Il existe certains outils qui peuvent vous aider à tester votre code tel que JUnit.

Utilisez la classe de test TestFindAndReplace.java pour tester votre programme.

* TestFindAndReplace.java

Effectuez tous les changements nécessaires afin que la méthode **findAndReplace** passe tous les tests.

## 3. Encore des objets

### Rational

Vous allez soumettre cet exercice. Téléchargez et complétez le fichier de démarrage ici:

* Rational.java

Vous devez implémenter une classe **Rational** afin de représenter des nombres rationnels. Un nombre rationnel comporte un numérateur et un dénominateur, tous deux de type **int**. Puisque chaque nombre possède son propre numérateur et dénominateur, ces variables sont des variables d'instance. De plus, nous prenons la bonne habitude de déclarer ces variables privées.

### 3.1 Constructeurs

La class **Rational** possède deux constructeurs. L'un d'eux a deux paramètres formels, dont les valeurs servent pour l'initialisation des variables d'instance. L'autre constructeur n'a qu'un paramètre, il s'agit du numérateur ; la valeur du dénominateur est alors 1\.

#### 3.2 Méthodes d'accès

Implémentez des méthodes d'accès « getters », en lecture seulement, afin de retourner la valeur du numérateur et la valeur du dénominateur respectivement. Un objet qui n'a pas de méthodes d'accès en écriture, « setters », et aucune autre méthode afin de changer l'état de l'objet, est dit immuable. C'est une propriété fort intéressante. Discutez-en avec vos voisins et votre démonstrateur.

#### 3.3a plus (instance)

Implémentez la méthode d'instance **plus**. Cette méthode n'a qu'un paramètre formel, de type **Rational**. La méthode retourne un nouvel objet **Rational** qui représente la somme de l'objet rational « this » avec celui passé en paramètre.

#### 3.3b plus (classe)

Implémentez la méthode de classe **plus**. Cette méthode possède deux paramètres formels, tous les deux de type **Rational**. La méthode retourne un nouvel objet représentant la somme des deux valeurs.

#### 3.4 gcd

Implémentez une méthode de classe privée afin de calculer le **plus grand diviseur commun** de deux nombres passés en paramètres.

#### 3.6a reduce

Implémentez une méthode d'instance privée que vous nommerez **reduce** et qui transforme cette instance en sa forme réduite. (ex: 18/4 -> 9/2)

#### 3.6b reduce

Effectuez les changements nécessaires pour que la classe sauvegarde toujours le nombre rationnel sous sa forme réduite.

#### 3.7 equals

Implémentez la méthode d'instance **public boolean equals( Rational o)** qui retourne vrai si cette fraction et celle désignée par le paramètre représentent la même fraction au sens logique, et faux sinon.

#### 3.8 toString

Implémentez une méthode **public String toString()** qui retourne une chaîne de caractères représentant cette fraction. Le format sera numérateur suivi de « / » suivi du dénominateur, ou encore, simplement le numérateur, si le dénominateur est 1.

#### 3.9 compareTo

Implémentez la méthode d'instance **int compareTo( Rational o)**. Celle-ci compare cet objet (this) et celui désigné par le paramètre « o » et retourne un entier négatif, si cette fraction est plus petite que celle désignée par le paramètre, 0 si elles sont égales, et un entier positif sinon.


## 5. Documentation : JavaDoc

La documentation des programmes est une autre activité importante. JavaDoc est un ensemble de règles pour les commentaires de vos programmes et un ensemble d'outils afin de produire des pages Web. En ITI1521, nous vous demandons de commenter tous vos programmes (variables, méthodes, etc.) à l'aide de **JavaDoc**.

La documentation JavaDoc est une série de commentaires avec une syntaxe spéciale. Ces commentaires JavaDoc sont une description du programme ou d’une méthode et commencent par « /\*\* », toutes les lignes suivantes commencent par « \* », et le bloc de commentaire est ferme avec « \*/ ». Si l’on veut changer de paragraphe, on utilise « \<p\> ».

Une fois la description finie, on doit utiliser les « block tags », les tags commencent par le symbole « @ ». Il existe plusieurs tags, mais nous allons nous concentrer sur ceux si :

*   **@author** : indique l’auteur du code
*   **@param** : dois être suivi du nom d’un paramètre de la méthode à laquelle il est relié, puis d’une description de ce paramètre
*   **@return** : est suivi d’une description de ce que retourne la méthode

Pour plus d’information, veuillez consulter la documentation de [JavaDoc](http://www.oracle.com/technetwork/articles/java/index-137868.html)

Exemple :

```java
/**
* this class represents a person
* <p>
* Note: Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Bob Smith
*/
public class Person {

   private String firstName;
   private String lastName;
   private String username;

   [...]

  /**
   * Constructor method initializing the first and last name.
   * Sets the default value for the username as "firstName.lastName".
   * @param firstName The first name of the person
   * @param lastName The last name of the person
   */
  public Person(String firstName, String lastName) {
    //no code before this call
    this(firstName, lastName, firstName + "." + lastName);
    //possibly more code here
  }

  /**
   * Constructor method initializing the first name, last name and the username.
   * @param firstName The first name of the person
   * @param lastName The last name of the person
   * @param username The preferred username of the person
   */
  public Person(String firstName, String lastName, String username) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
  }

  /**
   *this is a getter method
   *it is used to get the value of the variable firstName
   * @return String this returns the person's first name
   */
  public String getFirstName() {
    return firstName; //Here we do not need to use "this"
  }

  /**
   *this is a setter method
   *it is used to change the value of the variable firstName
   * @param firstName The value to assign to the instance variable firstName
   */
  public void setFirstName(String firstName){
    this.firstName = firstName; //Here we need to use the keyword "this"
  }
}
```

Vous devez ajouter des commentaires en format JavaDoc au fichier Utils.java.

1.  Documentez la méthode **findAndReplace** à l'aide de la syntaxe **JavaDoc**. Il doit y avoir une brève description de la méthode, des paramètres, ainsi que de la valeur de retour, et ce, à l'aide de la syntaxe JavaDoc.
2.  Commentez la classe Utils à l'aide de la syntaxe JavaDoc, assurez-vous d'y inclure le nom de l'auteur de la classe (vous).

Produisez des fichiers HTML automatiquement, soit à l'aide de votre environnement de programmation favori (DrJava, Eclipse, Netbeans, etc.), ou encore à l'aide de la commande javadoc dans un shell, les paramètres sont -d doc suivi d'une liste de fichiers sources à traiter :

```java
> javadoc -d doc Utils.java
```

Lorsqu’il y a plusieurs fichiers à traiter simultanément, utilisez * à la place des noms de fichiers.

```java
> javadoc -d doc *
```

## Resources

* [https://docs.oracle.com/javase/tutorial/getStarted/application/index.html](https://docs.oracle.com/javase/tutorial/getStarted/application/index.html)
* [https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html)
* [https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html)
* [https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html](https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html)
