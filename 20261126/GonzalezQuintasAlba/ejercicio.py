def primera_pregunta():
    """
    Mètode 1 (PrimeraPregunta):
    Mostra l'enunciat i les opcions, llegeix la resposta per teclat 
    i la retorna en majúscules.
    """
    print("\nPregunta 1: Qui va dirigir la famosa pel·lícula 'Jurassic Park' (1993)?")
    print("A) George Lucas")
    print("B) Stephen Spielberg")
    print("C) James Cameron")
    print("D) Christopher Nolan")
    
    entrada = input("Escriu la teva resposta (el nom complet): ")
    return entrada.strip().upper()


def resposta_primera(resposta):
    """
    Mètode 2 (respostaPrimera):
    Valida si la resposta és correcta independentment de com s'hagi escrit,
    gestiona respostes errònies amb missatges divertits i opcions no vàlides.
    Retorna 1 si encerta i 0 si falla.
    """
    correcta_neta = "STEPHEN SPIELBERG"

    if resposta == correcta_neta:
        print("\nMolt bé! 'Stephen Spielberg' és la resposta correcta. Ets un autèntic cinèfil!")
        return 1
    
    elif resposta == "GEORGE LUCAS":
        print("\nHas fallat! George Lucas va fer Star Wars, no els dinuaires de Jurassic Park! 🦖")
        return 0
    elif resposta == "JAMES CAMERON":
        print("\nHas fallat! James Cameron estava ocupat enfonsant el Titanic! 🚢")
        return 0
    elif resposta == "CHRISTOPHER NOLAN":
        print("\nHas fallat! En Nolan t'hauria fet una pel·lícula de somnis dins de somnis, però no aquesta! 🌀")
        return 0
    
    else:
        print("\nOpció no vàlida! Hauries d'haver escrit una de les opcions de la llista. T'has inventat la resposta! 😅")
        return 0


# Mètode principal (main)
if __name__ == "__main__":
    print("=== BENVINGUTS AL JOC DE PREGUNTES CULTURALS ===")
    
    # 1. Cridem el Mètode 1
    resposta_usuari = primera_pregunta()
    
    # 2. Cridem el Mètode 2
    resultat = resposta_primera(resposta_usuari)
    
    # Comprovació final al main
    if resultat == 1:
        print("\n[MAIN] Enhorabona! Has sumat 1 punt.")
    else:
        print("\n[MAIN] Oh, quina llàstima! Més sort la propera vegada.")