package Arrays;

public class countSeniorCitizens {
    public static int countSenior(String[] details){
        StringBuilder age = new StringBuilder();
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            for (int j = 0; j < details[i].length(); j++) {
                if(j == 11 || j == 12) age.append(details[i].charAt(j));
            }
            String a = age.toString();
            int s = Integer.parseInt(a);
            if(s > 60)count++;
            age = new StringBuilder();
        }
        return count;
    }
    public static void main(String[] args) {
        String[] details = {"1313579440F5036","2921522980M3644"};
        int res = countSenior(details);
        System.out.println(res);
    }
}
