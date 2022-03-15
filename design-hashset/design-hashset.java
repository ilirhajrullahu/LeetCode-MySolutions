class MyHashSet {

    List<Integer> setValues = new ArrayList<Integer>(); 
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        //Ska dupllikat
        if(setValues.isEmpty()){
            setValues.add(key);
        }else{
            //Nese ka dupllikata mos shto, nese ska, shtoje ne fund masi ti kqyr krejt
            if(contains(key)==false){
                setValues.add(key);
            }
        }
    }
    
    public void remove(int key) {
        for(int i = 0; i < setValues.size();++i){
            if(key==setValues.get(i)){
                setValues.remove(i);
            }
        }
    }
    
    public boolean contains(int key) {
        boolean duplicate = false;
        for(int i = 0; i < setValues.size(); ++i){
            if (key == setValues.get(i)){
                duplicate = true;
                break;
                }
            }
        return duplicate;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */