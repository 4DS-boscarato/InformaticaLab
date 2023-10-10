package aCaso;

public class caso1 {
    private static long valoriTot;
    private static int[][][][][][][][][][][][][][][] valori;

    public static long riempimento(){
        valori = new int [1][2][3][4][5][6][7][8][9][10][11][12][13][14][15];
        int vall = 0;

        for(int z = 0; z < valori.length; z++)
            for (int x = 0; x < valori.length; x++) {
                for (int c = 0; c < valori.length; c++) {
                    for (int v = 0; v < valori.length; v++) {
                        for (int b = 0; b < valori.length; b++) {
                            for (int n = 0; n < valori.length; n++) {
                                for (int m = 0; m < valori.length; m++) {
                                    for (int a = 0; a < valori.length; a++) {
                                        for (int s = 0; s < valori.length; s++) {
                                            for (int d = 0; d < valori.length; d++) {
                                                for (int f = 0; f < valori.length; f++) {
                                                    for (int g = 0; g < valori.length; g++) {
                                                        for (int h = 0; h < valori.length; h++) {
                                                            for (int j = 0; j < valori.length; j++) {
                                                                for (int k = 0; k < valori.length; k++) {
                                                                    vall++;
                                                                    valoriTot++;
                                                                    valori[z][x][c][v][b][n][m][a][s][d][f][g][h][j][k] = vall;

                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        return valoriTot;
    }

    public static int[][][][][][][][][][][][][][][] getValori() {
        return valori;
    }
}
