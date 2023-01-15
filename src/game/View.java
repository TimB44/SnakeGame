package game;

public class View{

        //State and View Fields
        private State state;
        private Control control;

        public View(Control control, State state) {
            this.state = state;
            this.control = control;
        }
}
