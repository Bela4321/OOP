package Zettel04;

public class Zettel04_3 {
    //a)

    static boolean canIWin(int pileA, int pileB) {
        if (pileA < 2 && pileB < 2) {
            return false;
        }
        if (pileA < 0 || pileB < 0) {
            return true;
        } else {
            if (pileA > pileB) {
                return (!canIWin(pileA - 2, pileB) || !canIWin(pileA - 3, pileB));
            } else if (pileA < pileB) {
                return (!canIWin(pileA, pileB - 2) || !canIWin(pileA, pileB - 3));
            } else {
                return (!canIWin(pileA - 2, pileB) || !canIWin(pileA - 3, pileB) || !canIWin(pileA, pileB - 2) || !canIWin(pileA, pileB - 3));
            }
        }
    }


    //b)
/*
boolean canIWin(int pileA, int pileB) {
    if (pileA < 2 && pileB < 2) {
        return false;
    }
    if (pileA < 0 || pileB < 0) {
        return true;
    } else {
        if (pileA > pileB) {
            return (!canIWin(pileA - 2, pileB) || !canIWin(pileA - 3, pileB));
        } else if (pileA<pileB) {
            return (!canIWin(pileA, pileB - 2) || !canIWin(pileA, pileB - 3));
        } else {
            return (!canIWin(pileA - 2, pileB) || !canIWin(pileA - 3, pileB) || !canIWin(pileA, pileB - 2) || !canIWin(pileA, pileB - 3));
        }
    }
}
*/
    void whatShouldIDo(int pileA, int pileB) {
        if (pileA <= pileB) {
            if (!canIWin(pileA, pileB - 2) && pileB - 2 >= 0) {
                System.out.println("Take 2 from Pile B");
                return;
            } else if (!canIWin(pileA, pileB - 3) && pileB - 3 >= 0) {
                System.out.println("Take 3 from Pile B");
                return;
            }
        }
        if (pileA >= pileB) {
            if (!canIWin(pileA - 2, pileB) && pileA - 2 >= 0) {
                System.out.println("Take 2 from Pile A");
                return;
            } else if (!canIWin(pileA - 3, pileB) && pileA - 3 >= 0) {
                System.out.println("Take 3 from Pile A");
                return;
            }
        }
        System.out.println("you're fucked ^_^, do whatever");
    }


    //c)
/*
boolean canIWin(int pileA, int pileB) {
    if (pileA < 2 && pileB < 2) {
        return false;
    }
    if (pileA < 0 || pileB < 0) {
        return true;
    } else {
        if (pileA > pileB) {
            return (!canIWin(pileA - 2, pileB) || !canIWin(pileA - 3, pileB));
        } else if (pileA < pileB) {
            return (!canIWin(pileA, pileB - 2) || !canIWin(pileA, pileB - 3));
        } else {
            return (!canIWin(pileA - 2, pileB) || !canIWin(pileA - 3, pileB) || !canIWin(pileA, pileB - 2) || !canIWin(pileA, pileB - 3));
        }
    }
}
*/
    static void simulateGame(int pileA, int pileB,String firstPlayer, String secondPlayer) {
        System.out.println("Pile A: "+pileA+" ;Pile B: "+pileB);
        if (pileA<2&&pileB<2) {
            System.out.println(firstPlayer+" lost");
            return;
        }
        if ( pileA == pileB) {
            if (!canIWin(pileA,pileB-2) && pileB-2 >= 0) {
                System.out.println(firstPlayer+ " takes 2 from Pile B:");
                simulateGame(pileA, pileB-2,secondPlayer,firstPlayer);
            } else if (!canIWin(pileA,pileB-3) && pileB-3 >= 0) {
                System.out.println(firstPlayer+ " takes 3 from Pile B:");
                simulateGame(pileA, pileB-3,secondPlayer,firstPlayer);
            } else if (!canIWin(pileA-2,pileB) && pileA-2 >= 0) {
                System.out.println(firstPlayer+ " takes 2 from Pile A:");
                simulateGame(pileA-2, pileB,secondPlayer,firstPlayer);
            } else if (!canIWin(pileA-3,pileB) && pileA-3 >= 0) {
                System.out.println(firstPlayer+ " takes 3 from Pile A:");
                simulateGame(pileA-3, pileB,secondPlayer,firstPlayer);
            } else {
                if (pileA>1) {
                    System.out.println(firstPlayer+ " takes 2 from Pile A:");
                    simulateGame(pileA-2, pileB,secondPlayer,firstPlayer);
                } else {
                    System.out.println(firstPlayer+ " takes 2 from Pile B:");
                    simulateGame(pileA, pileB-2,secondPlayer,firstPlayer);
                }
            }
        } else if (pileA<pileB) {
            if (!canIWin(pileA,pileB-2) && pileB-2 >= 0) {
                System.out.println(firstPlayer+ " takes 2 from Pile B:");
                simulateGame(pileA, pileB-2,secondPlayer,firstPlayer);
            } else if (!canIWin(pileA,pileB-3) && pileB-3 >= 0) {
                System.out.println(firstPlayer+ " takes 3 from Pile B:");
                simulateGame(pileA, pileB-3,secondPlayer,firstPlayer);
            } else {
                System.out.println(firstPlayer+ " takes 2 from Pile B:");
                simulateGame(pileA, pileB-2,secondPlayer,firstPlayer);
            }
        } else if (pileA>pileB) {
            if (!canIWin(pileA-2,pileB) && pileA-2 >= 0) {
                System.out.println(firstPlayer+ " takes 2 from Pile A:");
                simulateGame(pileA-2, pileB,secondPlayer,firstPlayer);
            } else if (!canIWin(pileA-3,pileB) && pileA-3 >= 0) {
                System.out.println(firstPlayer+ " takes 3 from Pile A:");
                simulateGame(pileA-3, pileB,secondPlayer,firstPlayer);
            } else {
                System.out.println(firstPlayer+ " takes 2 from Pile A:");
                simulateGame(pileA-2, pileB,secondPlayer,firstPlayer);
            }
        }
    }
    public static void main(String[] args) {
        simulateGame(15, 7, "Player 1", "Player 2");
    }
    /*
// Für Ausgabe: Siehe pdf-Dokument.
// hier weiterer Code: nicht als Abgabe. Bitte um Korrektur:


//b)

    void whatShouldIDo(int pileA, int pileB) {
        if (pileA > 2 & pileB > 2) {
            if (pileA >= pileB) {
                if (pileA % 2 == 0) {
                }if (pileA == 2) {
                    System.out.println("Take 2 from pile A.");
                } else {
                    System.out.println("Take 3 from pile A.");
                }
            }if (pileA % 2 != 0) {
                if (pileA == 3) {
                    System.out.println("Take 3 from pile A");
                } else {
                    System.out.println("Take 2 from pile A.");
                }
            }
        } if (pileB > pileA) {
            if (pileB % 2 == 0) {
                if (pileB == 2) {
                    System.out.println("Take 2 from pile B.");
                } else {
                    System.out.println("Take 3 from pile B.");
                }
            }if (pileB % 2 != 0) {
                if (pileA == 3) {
                    System.out.println("Take 3 from pile A");
                } else {
                    System.out.println("Take 2 from pile A.");
                }
            }
        }
    } else {
    System.out.println("You lost.");
}
}

//c)

    void pileGame(int pileA, int pileB, String firstPlayer, String secondPlayer) {
    if (pileA >= 2 || pileB >= 2) {
    if (pileA >= pileB) {
    if (pileA % 2 == 0) {
    if (pileA == 2) {
    System.out.println(firstPlayer + " takes 2 from pile A.");
    pileGame(0, pileB, secondPlayer, firstPlayer);
}else {
    System.out.println(firstPlayer + " takes 3 from pile A.");
    pileGame(pileA - 3, pileB, secondPlayer, firstPlayer);
}
}if (pileA % 2 != 0) {
    if (pileA == 3) {
    System.out.println(firstPlayer + " takes 3 from pile A");
    pileGame(0, pileB, secondPlayer, firstPlayer);
}else {
    System.out.println(firstPlayer + " takes 2 from pile A.");
    pileGame(pileA - 2, pileB, secondPlayer, firstPlayer);
}
}
}if (pileB > pileA) {
    if (pileB % 2 == 0) {
    if (pileB == 2) {
    System.out.println(firstPlayer + " takes 2 from pile B.");
    pileGame(pileA, 0, secondPlayer, firstPlayer);
} else {
    System.out.println(firstPlayer + " takes 3 from pile B.");
    pileGame(pileA, pileB - 3, secondPlayer, firstPlayer);
}
}if (pileB % 2 != 0) {
    if (pileB == 3){
    System.out.println(firstPlayer + " takes 3 from pile B.");
    pileGame(pileA, 0, secondPlayer, firstPlayer);
}else {
    System.out.println(firstPlayer + " takes 2 from pile B.");
    pileGame(pileA, pileB - 2, secondPlayer, firstPlayer);
}
}
}
} if (pileA <2 && pileB < 2) {
    System.out.println(firstPlayer + " lost.");
}
}

 */
}
