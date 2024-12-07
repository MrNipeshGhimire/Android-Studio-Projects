public class secondactivity {
    taxtview txtResult
            @Override
    protected void onCreate(Bundle b){
        super.oncreate(b);
        setcontentview(R.id.txtResult);
        txtResult=findvaluebyid(r.id.txtResult);
        intent i=get(intent);
        string name=i.getStringExtra(name:"loginName");
        string pass=i.getstringExtra( name:"loginPassword");
        txtResult.setText("hello"+name+"your password is"+pass);
            }
}

