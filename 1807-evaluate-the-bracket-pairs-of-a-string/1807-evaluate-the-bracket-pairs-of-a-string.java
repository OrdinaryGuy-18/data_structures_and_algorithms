class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int started = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                started = 1;
                continue;
            }

            if (ch == ')') {
                String value = map.get(temp.toString());

                if (value == null) {
                    sb.append('?');
                } else {
                    sb.append(value);
                }

                temp.setLength(0);
                started = 0;
                continue;
            }

            if (started == 1) {
                temp.append(ch);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}