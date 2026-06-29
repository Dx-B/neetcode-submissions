class TimeMap {

    public HashMap<String, ArrayList<String[]>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        String[] pair = new String[]{value,Integer.toString(timestamp)};
        if (map.containsKey(key)) {
            map.get(key).add(pair);
        }
        else {
            map.put(key, new ArrayList<String[]>());
            map.get(key).add(pair);
        }
    }
    
    public String get(String key, int timestamp) {
        // Binary Search target is timestamp.

        // return the value directly
        if (this.map.containsKey(key)) {
            return search(timestamp, this.map.get(key));
        }
        else {
            return "";
        }
    }

    private String search(int timestamp, ArrayList<String[]> list) {
        // arraylist of string[]s, of ["emotion",timestamp]
        String prev = "";
        int l = 0;
        int r = list.size()-1;
        while (l <= r) {
            int middle = (l+r)/2;
            if (Integer.parseInt(list.get(middle)[1]) < timestamp) {
                prev = list.get(middle)[0];
                l = middle+1;
            }
            else if (Integer.parseInt(list.get(middle)[1]) > timestamp) {
                r = middle-1;
            }
            else {
                return list.get(middle)[0];
            }
        }
        return prev;
        // how do we implement adding whatever was last seen if we didn't find one for this timestamp?
    }
}
