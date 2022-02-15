package inputOutput;

import java.io.FileInputStream;

public class ValidNumbers {
    public static String getValidNumbers(String str) {
        if (str.length() > 11 && str.length() < 15) {
            char[] str1 = str.toCharArray();
            if (str1[0] == 40 & str1[4] == 41)  {
                if (str1[1] > 47 && str1[1] < 58) {
                if (str1[2] > 47 && str1[2] < 58 && str1[3] > 47 && str1[3] < 58) {
                    if (str1[6] > 47 && str1[6] < 58 && str1[7] > 47 && str1[7] < 58) {
                        if (str1[5] == 32) {
                            if (str1[8] > 47 && str1[8] < 58 && str1[10] > 47 && str1[10] < 58) {
                                if (str1[11] > 47 && str1[11] < 58 && str1[12] > 47 && str1[12] < 58) {
                                    if (str1[13] > 47 && str1[13] < 58) {
                                        if (str1[9] == 45) {
                                            return String.valueOf(str1);
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }}
                    if (str1[0] > 47 && str1[0] < 58 && str1[1] > 47 && str1[1] < 58) {
                        if (str1[2] > 47 && str1[2] < 58 && str1[4] > 47 && str1[4] < 58) {
                            if (str1[3] == 45 && str1[7] == 45) {
                                if (str1[5] > 47 && str1[5] < 58 && str1[6] > 47 && str1[6] < 58) {
                                    if (str1[8] > 47 && str1[8] < 58 && str1[9] > 47 && str1[9] < 58) {
                                        if (str1[10] > 47 && str1[10] < 58 && str1[11] > 47 && str1[11] < 58) {
                                                return String.valueOf(str1);
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
        else return null;

        return null;
    }

}

