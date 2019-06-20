package com.ds.example.mypersonalproject;


    public class DBList {
        private String CodeID;
        private String CodeNAME;

        public DBList(String CodeID, String CodeNAME){
            this.CodeID = CodeID;
            this.CodeNAME = CodeNAME;
        }

        public String getCodeID() {
            return CodeID;
        }
        public void setAccountId(String CodeID) {
            this.CodeID = CodeID;
        }
        public String getCodeNAME() {
            return CodeNAME;
        }
        public void setAccountPw(String CodeNAME) {
            this.CodeNAME = CodeNAME;
        }
    }
