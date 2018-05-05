  import java.util.Scanner;

public class Adsl  {

  public static void main(String[] args) {

    System.out.println("BLOCCHETTO ADSL HELPER  - ** Luca Pignatelli **");
    System.out.println("Inserire numero filo ADSL");
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    switch (i) {
      case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
         System.out.println("Primo Splitter\n"); break;
      case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16:
         System.out.println("Secondo Splitter\n"); break;
      case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24:
         System.out.println("Terzo Splitter\n"); break;
      case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32:
         System.out.println("Quarto Splitter\n"); break;
      case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40:
         System.out.println("Quinto Splitter\n"); break;
      case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48:
         System.out.println("Sesto Splitter\n"); break;
      case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56:
         System.out.println("Settimo Splitter\n"); break;
      case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64:
         System.out.println("Ottavo Splitter\n"); break;
      case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72:
         System.out.println("Nono Splitter\n"); break;
      case 73: case 74: case 75: case 76: case 77: case 78: case 79: case 80:
         System.out.println("Decimo Splitter\n"); break;
      case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88:
         System.out.println("Undicesimo Splitter\n"); break;
      case 89: case 90: case 91: case 92: case 93: case 94: case 95: case 96:
         System.out.println("Dodicesimo Splitter\n"); break;
      case 97: case 98: case 99: case 100: case 101: case 102: case 103: case 104:
         System.out.println("Tredicesimo Splitter\n"); break;
      case 105: case 106: case 107: case 108: case 109: case 110: case 111: case 112:
         System.out.println("Quattordicesimo Splitter\n"); break;
      case 113: case 114: case 115: case 116: case 117: case 118: case 119: case 120:
         System.out.println("Quindicesimo Splitter\n"); break;
      case 121: case 122: case 123: case 124: case 125: case 126: case 127: case 128:
         System.out.println("Sedicesimo Splitter\n"); break;
      default: System.out.println("immettere numero corretto..");
      }
      switch (i) {
       case 1: case 9: case 17: case 25: case 33: case 41:	case 49: case 57: case 65: case 73: case 81: case 89: case 97:	case 105: case 113: case 121:
         System.out.println("P1 \n"); break;
       case 2: case 10: case 18: case 26: case 34:	case 42: case 50: case 58: case 66: case 74: case 82: case 90: case 98:	case 106: case 114: case 122:
         System.out.println("L1\n"); break;
       case 3: case 11: case 19: case 27: case 35:	case 43: case 51: case 59: case 67: case 75: case 83: case 91:	case 99: case 107: case 115: case 123:
         System.out.println("P2\n"); break;
      case 4: case 12: case 20: case 28: case 36:	case 44: case 52: case 60: case 68: case 76: case 84: case 92:	case 100: case 108: case 116: case 124:
         System.out.println("L2\n"); break;
      case 5: case 13: case 21: case 29:	case 37: case 45: case 53: case 61: case 69: case 77: case 85:	case 93: case 101: case 109: case 117: case 125:
         System.out.println("P3\n"); break;
      case 6: case 14: case 22: case 30: case 38:	case 46: case 54: case 62: case 70: case 78: case 86:	case 94: case 102: case 110: case 118: case 126:
         System.out.println("L3\n"); break;
      case 7: case 15: case 23: case 31:	case 39: case 47: case 55: case 63: case 71: case 79: case 87: case 95:	case 103: case 111: case 119: case 127:
         System.out.println("P4\n"); break;
      case 8: case 16: case 24: case 32: case 40:	case 48: case 56: case 64: case 72: case 80: case 88: case 96: case 104: case 112: case 120: case 128:
         System.out.println("L4\n"); break;
      }
    }
  }
