package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class couponCodeValidator {
    public static void main(String[] args) {
        String[] code = {"SAVE20","","PHARMA5","SAVE@20"};
        String[] businessLine = {"restaurant","grocery","pharmacy","restaurant"};
        boolean[] isActive = {true,true,true,true};
        ArrayList<String> res = validateCoupons(code,businessLine,isActive);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    private static ArrayList<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int i = 0;
        ArrayList<Coupon> al = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("electronics",1); map.put("grocery",2); map.put("pharmacy",3); map.put("restaurant",4);

        while (i < code.length){
            String c = code[i];
            String b = businessLine[i];
            boolean a = isActive[i];

            if (!c.isEmpty()) {
                boolean isValidCode = true;
                for (int l = 0; l < c.length(); l++) {
                    char ch = c.charAt(l);
                    if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
                        isValidCode = false;
                        break;
                    }
                }

                if (isValidCode && map.containsKey(b) && a) {
                    al.add(new Coupon(c, b));
                }
            }

            i++;
        }


        al.sort((c1,c2) -> {
            int cmp = Integer.compare(map.get(c1.businessLine), map.get(c2.businessLine));
            if (cmp != 0) return cmp;
            return c1.code.compareTo(c2.code);
        });

        ArrayList<String> sortedCodes = new ArrayList<>();
        for (Coupon coupon : al) {
            sortedCodes.add(coupon.code);
        }
        return sortedCodes;
    }
    static class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
