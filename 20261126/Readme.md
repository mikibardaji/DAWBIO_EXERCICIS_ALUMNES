# Joc de preguntes culturals (Versió Proven)

<img src="millonario.jpeg" alt="Logo Quién quiere ser millonario Versió Proven" width="400">

Crearem dos mètodes per implementar entre tots un joc de preguntes de cultura general. Podeu triar qualsevol temàtica que domineu, sempre que el contingut sigui respectuós i no ofensiu.

## Tasques a realitzar

Inicialment, heu de programar els dos mètodes següents:

* **Mètode 1 (`PrimeraPregunta`):** 
  * Ha de mostrar per pantalla l'enunciat de la pregunta juntament amb les 4 opcions possibles (A, B, C, D).
  * Ha d'esperar que el jugador introdueixi la seva resposta per teclat, no la lletra, sino la resposta total.
  * Ha de retornar la resposta introduïda convertida a **majúscules**.

* **Mètode 2 (`respostaPrimera`):** 
  * Ha de rebre per paràmetre un `String` amb la resposta del jugador.
  * Ha de comprovar i indicar per pantalla si la resposta és correcta, conteu, que no sabeu com ve d'entrada, per tant, hauria de validar que fos correcta, estigues com estigués escrit
  * Si l'usuari falla, ha de mostrar un missatge personalitzat i divertit diferent per a cada opció errònia vàlida.
  * També ha de gestionar el cas en què l'usuari introdueixi una opció no vàlida (diferent de les esperades).
  * Retornara 1 si has encertat i 0, sino.

## Proves i ampliació

1. **Comprovació al `main`:** Crida els mètodes des del mètode `main` per verificar que tot funciona correctament.
2. **Pregunta extra (opcional):** Si acabes abans que la resta de companys, crea dos mètodes addicionals (`preguntaSegona` i `respostaSegona`) per afegir una segona pregunta al joc.

## Lliurament i treball col·laboratiu

* **Pujada del fitxer:** Quan ho tinguis acabat, puja en una carpeta amb el teu cognom  **únicament el teu fitxer `.java`** (sense comprimir ni dins de cap carpeta).
* **Integració:** Quan vegis els fitxers dels teus comanys de classe, baixa'ls i prova'ls dins el teu projecte.
