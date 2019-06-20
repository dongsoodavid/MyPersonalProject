package com.ds.example.mypersonalproject;


    public class DBList { {
        String BigCategory;
        String SmallCategory;
        String ClassName ;

        public AccountList(BigCategory, SmallCategory, ClassName){
            this.BigCategory = BigCategory;
            this.SmallCategory = SmallCategory;
            this.ClassName= ClassName;
        }

        public String getAccountId() {
            return accountId;
        }
        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }
        public String getAccountPw() {
            return accountPw;
        }
        public void setAccountPw(String accountPw) {
            this.accountPw = accountPw;
        }
    }
}
