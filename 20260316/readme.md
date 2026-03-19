##Exercici 1: El Magatzem de Logística
Una empresa rep paquets. Cada paquet té un Codi de Barres (String) i un Producte (String). L'empresa vol imprimir la llista i que els paquets surtin en el mateix ordre en què han arribat.

Crea el Map adequat segons la teoria.
Afegeix: "P01" -> "Monitor", "P02" -> "Teclat", "P03" -> "Ratolí".
Imprimeix el Map, item a item. Què observes respecte al llistats?.
Consulta si tens un producte P06. Que faries perque et mostres la frase "No hi ha producte", en aquests casos (sigui P06, P07, etc.. )

##Exercici 2: L'Agenda Automàtica
Volem guardar contactes. La clau és el Nom i el valor és el Telèfon. L'usuari vol que l'agenda estigui sempre ordenada alfabèticament sense fer servir cap mètode sort().

Crea el Map adequat segons la teoria.
Afegeix: "Zaira", "Albert" i "Berta".
Mostra el resultat.
Què passa si fas un .put() sobre "Albert" amb un telèfon nou?

##Exercici 3: El Comptador de Paraules (Repte de lògica)
Donada la següent llista, compta quantes vegades apareix cada fruita:
"poma", "pera", "poma", "plàtan", "poma", "pera"

Quin seria el map segons la teoria més adequat.
Codi per completar:

List<String> fruites = Arrays.asList("poma", "pera", "poma", "plàtan", "poma", "pera");
Map<String, Integer> comptador = new HashMap<>();

for (String f : fruites) {
    // Si la fruita ja està al map, suma-li 1 al valor actual
    // Si no hi és, afegeix-la amb valor 1
}
System.out.println(comptador);
