public class SingletonExample {
    static class SingletonEager {
        private static SingletonEager instance = new SingletonEager();
        private SingletonEager(){};

        public static SingletonEager getInstance(){
            return instance;
        }
    }

    static class SingletonLazy {
        private static SingletonLazy instance;

        private SingletonLazy(){};

        public static SingletonLazy getInstance(){
            if(instance == null){
                instance = new SingletonLazy();
            }
            return instance;
        }
    }

    static class SingletonSyncMethod {
        private static SingletonSyncMethod instance;
        private SingletonSyncMethod(){};

        public static synchronized SingletonSyncMethod getInstance(){
            if(instance == null){
                instance = new SingletonSyncMethod();
            }
            return instance;
        }
    }

    static class SingletonSyncBlock {
        private static SingletonSyncBlock instance;
        private SingletonSyncBlock(){};

        public static SingletonSyncBlock getInstance(){
            if(instance == null){
                synchronized(SingletonSyncBlock.class){
                    instance = new SingletonSyncBlock();
                }
            }
            return instance;
        }
    }


    public static void main(String[] args) {

    }
}
