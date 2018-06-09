import { Component, OnInit } from '@angular/core';
import { SpoService } from '../../services/spo.service';
import { NestedTreeControl } from '@angular/cdk/tree';
import { Spo } from '../../shared/models/spo';

import { FileNode } from '../../shared/models/file-node';
import { FileDatabase } from '../../shared/helper/file-database';
import { MatTreeNestedDataSource } from '@angular/material';
import { of as observableOf } from 'rxjs';

@Component({
  selector: 'app-spo',
  templateUrl: './spo.component.html',
  styleUrls: ['./spo.component.scss'],
  providers: [FileDatabase]
})
export class SpoComponent implements OnInit {

  nestedTreeControl: NestedTreeControl<FileNode>;
  nestedDataSource: MatTreeNestedDataSource<FileNode>;
  spos: Spo[];

  constructor(private spoService: SpoService, database: FileDatabase) {
    this.nestedTreeControl = new NestedTreeControl<FileNode>(this._getChildren);
    this.nestedDataSource = new MatTreeNestedDataSource();

    database.dataChange.subscribe(data => this.nestedDataSource.data = data);
  }

  ngOnInit() {
    this.getSpos();
  }

  getSpos(): void {
    this.spoService.getSpos()
      .subscribe(spos => this.spos = spos);
  }

  private _getChildren = (node: FileNode) => { return observableOf(node.children); };

  hasNestedChild = (_: number, nodeData: FileNode) => { return !(nodeData.type); };
}
