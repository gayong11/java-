class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        String details = "";
        int totalMoney = 0;

        while(isFlag) {
            System.out.println("----------------家庭收支记账软件-----------------\n");
            System.out.println("                  1 收支明细");
            System.out.println("                  2 登记收入");
            System.out.println("                  3 登记支出");
            System.out.println("                  4 退    出");
            System.out.println("                  请选择(1-4): ");

            // 获取用户选择
            char selection = Utility.readMenuSelection();

            switch (selection) {
                case '1':
                    System.out.println("----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说    明\n");
                    System.out.println(details);
                    System.out.println("-------------------------------------------------");
                    break;
                case '2':
                    System.out.print("输入收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("输入收入说明：");
                    String info = Utility.readString();
                    String str = "收入\t";
                    totalMoney += money;
                    str = str + totalMoney + '\t' + '\t';
                    str = str + money + '\t' + '\t';
                    str = str + info + '\n';
                    details += str;
                    System.out.println("------------------登记完成-------------------\n");
                    break;
                case '3':
                    System.out.print("输入支出金额：");
                    int outMoney = Utility.readNumber();
                    System.out.print("输入支出说明：");
                    String outInfo = Utility.readString();
                    String outStr = "支出\t";
                    totalMoney -= outMoney;
                    outStr = outStr + totalMoney + '\t' + '\t';
                    outStr = outStr + outMoney + '\t' + '\t';
                    outStr = outStr + outInfo + '\n';
                    details += outStr;
                    System.out.println("------------------登记完成-------------------\n");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }
}