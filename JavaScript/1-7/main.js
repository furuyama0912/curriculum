class Taiyaki {

  constructor(anko,kurimu,tizu){
    this.anko=anko;
    this.kurimu=kurimu;
    this.tizu=tizu;
  }

  aji(){
    console.log("中身は"+this.anko+"です");
    console.log("中身は"+this.kurimu+"です");
    console.log("中身は"+this.tizu+"です");
  }

}

let nakami = new Taiyaki("あんこ","クリーム","チーズ");
nakami.aji();