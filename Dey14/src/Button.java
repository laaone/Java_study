public class Button {

    static interface OnClickListener {
        void onClick();
    }

    OnClickListener listener;

    void setListener( OnClickListener listener ){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }
}//end
