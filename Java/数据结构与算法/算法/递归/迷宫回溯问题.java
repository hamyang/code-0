package 递归;

public class 迷宫回溯问题 {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        // 将上下全部置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 将左右全部置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        setWay(map, 1, 1);
        graph.export(map);
        setWay2(map, 1, 1);
        graph.export(map);
        setWay3(map, 1, 1);
        graph.export(map);
        setWay4(map, 1, 1);
        graph.export(map);

    }

    /**
     * @param map 表示地图
     * @param i   开始横坐标
     * @param j   开始纵坐标
     * @return 如果找到通路就返回true，否则返回false
     */
    //i为纵向j为横向
    // 策略，下右上左
    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // i为纵向j为横向
    // 策略，下右左上
    public static boolean setWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    //i为纵向j为横向
    // 策略，右下上左
    public static boolean setWay3(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    //i为纵向j为横向
    // 策略，右下上左
    public static boolean setWay4(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}

class graph {
    // 二维数组的各种参数设置
    public static int[][] num() {
        int[][] map = new int[8][7];
        // 将上下全部置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 将左右全部置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        return map;

    }

    // 输出二维数组
    public static void export(int map[][]) {
        int a = 2;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (map[i][j] == 2) {
                    System.out.print("\033[31;4m" + a + "\033[0m" + "   ");
                } else {
                    System.out.print(map[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
}


