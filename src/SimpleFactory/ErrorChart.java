package SimpleFactory;

class ErrorChart {  
    private String type; //ͼ������  
      
    public ErrorChart(Object[][] data, String type) {  
        this.type = type;  
        if (type.equalsIgnoreCase("histogram")) {  
            //��ʼ����״ͼ  
        }  
        else if (type.equalsIgnoreCase("pie")) {  
            //��ʼ����״ͼ  
        }  
        else if (type.equalsIgnoreCase("line")) {  
            //��ʼ������ͼ  
        }  
    }  
  
    public void display() {  
        if (this.type.equalsIgnoreCase("histogram")) {  
            //��ʾ��״ͼ  
        }  
        else if (this.type.equalsIgnoreCase("pie")) {  
            //��ʾ��״ͼ  
        }  
        else if (this.type.equalsIgnoreCase("line")) {  
            //��ʾ����ͼ  
        }     
    }  
}  

