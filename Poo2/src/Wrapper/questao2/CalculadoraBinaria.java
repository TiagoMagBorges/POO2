package Wrapper.questao2;

public class CalculadoraBinaria implements CalculadoraBinariaInterface{
    @Override
    public String somar(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0)
            res.append(carry);

        return res.reverse().toString();
    }

    @Override
    public String subtrair(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int borrow = 0;

        while (i >= 0 || j >= 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            digitA -= borrow;

            if (digitA < digitB) {
                digitA += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            int difference = digitA - digitB;
            res.append(difference);
        }

        while (res.length() > 1 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }
        return res.reverse().toString();
    }
}
